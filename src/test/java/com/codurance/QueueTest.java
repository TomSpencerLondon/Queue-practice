package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueueTest {
    @Test
    void newQueueIsEmpty() {
        Queue queue = new Queue();
        assertThat(queue.isEmpty())
                .isTrue();
    }

    @Test
    void emptyIsFalseAfterAdd() {
        Queue queue = new Queue();
        queue.add(7);
        assertThat(queue.isEmpty())
                .isFalse();
        assertThat(queue.size())
                .isEqualTo(1);
    }

    @Test
    void emptyIsTrueAfterAddThenRemove() {
        Queue queue = new Queue();
        queue.add(7);
        queue.remove();
        assertThat(queue.isEmpty())
                .isTrue();
        assertThat(queue.size())
                .isZero();
    }

    @Test
    void add7ThenRemoveReturns7() {
        Queue queue = new Queue();
        queue.add(7);
        int element = queue.remove();
        assertThat(element)
                .isEqualTo(7);
    }

    @Test
    void add4ThenRemoveReturns4() {
        Queue queue = new Queue();
        queue.add(4);
        int element = queue.remove();
        assertThat(element)
                .isEqualTo(4);
    }

    @Test
    void addTwoNumbersReturnsSizeOf2() {
        Queue queue = new Queue();
        queue.add(4);
        queue.add(7);

        assertThat(queue.size())
                .isEqualTo(2);
    }
}
