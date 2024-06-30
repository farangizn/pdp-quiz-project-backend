package uz.muhammadtrying.pdpquizprojectbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserSettingsDTO {
    private String photoUrl;
    private String fullName;
    private String email;
}