/*
 * Copyright (c) 2014. Clément Bazin
 *
 *     This file is part of OstéoManager.
 *
 *     OstéoManager is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     any later version.
 *
 *     OstéoManager is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Foobar.  If not, see <http://www.gnu.org/licenses/>. 2
 */

package net.baz1.osteo.manager.domain.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by Clément Bazin on 14/12/14.
 */

@Document
@Data
@ToString(callSuper = true)
public class Patient extends Human {

    private Date birthDay;

    private int heightInCm;
    private int weightInKg;
    private String profession;

    @DBRef
    private List<MedicalProfessional> MedicalStaff;
    private String socialSecurityNumber;
    private String healthInsurance;

    private String allergy;
    private String personalMedicalHistory;
    private String familyMedicalHistory;
    private String other;

    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
