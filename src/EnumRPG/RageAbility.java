package EnumRPG;

        public class RageAbility extends Ability {
            @Override
            public void useAbility(Character attacker, Character defender) {
                int maxAbilityCount = 3;
                double tempDamage = attacker.getDamage();
                if (attacker.getAbilityCounter() < maxAbilityCount) {
                    if (attacker.getHealth() < (attacker.getRace().getHealth() + attacker.getCharacterClass().getHealth())
                            * 0.6) {
                        double currentDamage = attacker.getDamage();
                        double increasedDamage = currentDamage * 1.2;
                        System.out.println(attacker.getName() + " belépett rage módba.");
                        attacker.setDamage(increasedDamage);

                        attacker.incrementAbilityCounter();
                    }
                } else {
                    attacker.setDamage(tempDamage);
                    System.out.println(attacker.getName() + " kilépett rage módból.");
                }
            }
        }
