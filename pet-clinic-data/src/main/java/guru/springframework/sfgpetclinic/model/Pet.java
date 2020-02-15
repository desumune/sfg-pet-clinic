package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetTpe petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetTpe getPetType() {
        return petType;
    }

    public void setPetType(PetTpe petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
