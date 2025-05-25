package mcacejr.majmods.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent HOLLY_BERRY_FOOD_COMP =
            new FoodComponent.Builder().hunger(1).saturationModifier(0).snack().alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0), 0.5f).build();

}
