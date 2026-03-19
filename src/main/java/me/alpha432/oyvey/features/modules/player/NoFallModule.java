onAbilityUse(player):
    if cooldown active:
        return
    
    target = getNearestEntity(player, range=4)
    
    if target exists:
        damage(target, amount=4)
        playEffect()
        setCooldown(player, 2 seconds)
