/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.keevosh.aksosrooms.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Orestis
 */
@Entity
@DiscriminatorValue("admin")
public class Admin extends User{
    
}
