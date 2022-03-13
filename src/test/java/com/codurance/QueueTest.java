package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class QueueTest {
    @Test
    void newQueueIsEmpty() {
        Queue queue = Queue.Make(2);
        assertThat(queue.isEmpty())
                .isTrue();
    }

    @Test
    void emptyIsFalseAfterAdd() {
        Queue queue = Queue.Make(2);
        queue.add(7);
        assertThat(queue.isEmpty())
                .isFalse();
        assertThat(queue.size())
                .isEqualTo(1);
    }

    @Test
    void emptyIsTrueAfterAddThenRemove() {
        Queue queue = Queue.Make(2);
        queue.add(7);
        queue.remove();
        assertThat(queue.isEmpty())
                .isTrue();
        assertThat(queue.size())
                .isZero();
    }

    @Test
    void add7ThenRemoveReturns7() {
        Queue queue = Queue.Make(2);
        queue.add(7);
        int element = queue.remove();
        assertThat(element)
                .isEqualTo(7);
    }

    @Test
    void add4ThenRemoveReturns4() {
        Queue queue = Queue.Make(2);
        queue.add(4);
        int element = queue.remove();
        assertThat(element)
                .isEqualTo(4);
    }

    @Test
    void addTwoNumbersReturnsSizeOf2() {
        Queue queue = Queue.Make(2);
        queue.add(4);
        queue.add(7);

        assertThat(queue.size())
                .isEqualTo(2);
    }

    @Test
    void removeFromEmptyQueueThrowsUnderflowException() {
        Queue queue = Queue.Make(2);

        assertThatThrownBy(queue::remove)
                .isInstanceOf(UnderflowException.class);
    }

    @Test
    void addXAndYThenRemoveXThenY() {
        Queue queue = Queue.Make(2);
        queue.add(7);
        queue.add(4);

        assertThat(queue.remove())
                .isEqualTo(7);
        assertThat(queue.remove())
                .isEqualTo(4);
    }

    @Test
    void addingMoreThanInitialCapacityIncreasesSize() {
        Queue queue = Queue.Make(2);
        queue.add(7);
        queue.add(4);
        queue.add(3);

        assertThat(queue.remove())
                .isEqualTo(7);
    }
}
