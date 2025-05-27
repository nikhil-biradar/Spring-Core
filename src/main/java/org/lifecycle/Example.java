package org.lifecycle;

import lombok.*;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/// Implementing bean life cycle using interfaces
@Getter @Setter
@NoArgsConstructor
public class Example {
    private String subject;

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("Starting method");
    }

    @PreDestroy
    public void end(){
        System.out.println("Ending method");
    }
}