package org.collections;

import lombok.*;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String, String> courses;

}