package com.quispe.angelo.poketinder.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.quispe.angelo.poketinder.data.database.dao.PokemonDao
import com.quispe.angelo.poketinder.data.database.entities.MyPokemonEntity

@Database(entities = [MyPokemonEntity::class], exportSchema = false, version = 1)
abstract class PokemonDatabase: RoomDatabase() {
    abstract fun getPokemonDao(): PokemonDao
}
