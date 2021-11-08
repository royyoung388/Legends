# Design Pattern
## MVC pattern
    View:
        BoardView:            show board
        FightView:            show team and enemy information, and log
        HeroView:             show hero information
        MarketView:           show market
        MonsterView:          show monster information
    Controller:
        TeamControllerImpl:    Used for a team. contains a list of hero, backpack, money.
        TeamController

        MonsterControllerImpl: Used for monster. Control the action of monster
        MonsterController

        MarketControllerImpl:  Used for market. Control the action of market
        MarketController

        HeroController
        HeroControllerImpl:    Used for hero, can get or set attribute of hero

        FightControllerImpl:   Used for fight. Control the procedure of fight.
        FightController

        CharacterControllerImpl: Base class for all character
        CharacterController

        BoardControllerImpl:   Control the board
        BoardController
    Model:
        Backpack:    backpack for team
        MarketModel: market, contains list of items
        BoardModel
            Cell
            Marker
        Monster:    Base abstract class for Monster
            Dragon
            Exoskeleton
            Spirit
        Character:  Base class for character
            Hero
                Paladin
                Sorcerer
                Warrior
            Item
                Potion
                Spell
                Weapon
                Armor

## Factory pattern:
    FileUtils:      helper to read information from file.
    HeroFactory:    create hero from file
    ArmorFactory:   create armor from file
    MonsterFactory: create monster from file
    PotionFactory:  create potion from file
    SpellFactory:   create spell from file
    WeaponFactory:  create weapon from file

## State Pattern:
    State:      State pattern interface.
    BaseState:  Base class for all state
    Context:    Has some important variable. such as game reference.
    FightState: Fight
    ItemState:  Show item
    MarketState:Market
    SellState:  Sell items
    WalkState:  Walk in the map

# Structure
RPGGame -> LegendGame
Character -> Hero / Monster -> Paladin... / Dragon...
Item -> Armor, potion...
TeamController (has) -> list of HeroController

# Scalability and Extendibility
Has many interfaces: such as Usable, Attackable, Castable...
Good Structure with design pattern