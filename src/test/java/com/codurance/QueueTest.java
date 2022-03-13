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
    }


}
