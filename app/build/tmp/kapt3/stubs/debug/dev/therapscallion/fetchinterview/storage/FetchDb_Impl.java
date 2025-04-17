package dev.therapscallion.fetchinterview.storage;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLiteConnection;
import javax.annotation.processing.Generated;
import kotlin.Lazy;
import kotlin.String;
import kotlin.Suppress;
import kotlin.collections.Map;
import kotlin.collections.MutableMap;
import kotlin.collections.MutableSet;
import kotlin.collections.Set;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u001a\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0016\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\u0015H\u0016J\"\u0010\u0016\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\t0\fH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Ldev/therapscallion/fetchinterview/storage/FetchDb_Impl;", "Ldev/therapscallion/fetchinterview/storage/FetchDb;", "()V", "_hiringItemDao", "Lkotlin/Lazy;", "Ldev/therapscallion/fetchinterview/storage/HiringItemDao;", "clearAllTables", "", "createAutoMigrations", "", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "", "Lkotlin/reflect/KClass;", "Landroidx/room/migration/AutoMigrationSpec;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "getHiringItemDao", "getRequiredAutoMigrationSpecClasses", "", "getRequiredTypeConverterClasses", "app_debug"})
@javax.annotation.processing.Generated(value = {"androidx.room.RoomProcessor"})
@kotlin.Suppress(names = {"UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"})
public final class FetchDb_Impl extends dev.therapscallion.fetchinterview.storage.FetchDb {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy<dev.therapscallion.fetchinterview.storage.HiringItemDao> _hiringItemDao = null;
    
    public FetchDb_Impl() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected androidx.room.RoomOpenDelegate createOpenDelegate() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected androidx.room.InvalidationTracker createInvalidationTracker() {
        return null;
    }
    
    @java.lang.Override()
    public void clearAllTables() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.util.Map<kotlin.reflect.KClass<?>, java.util.List<kotlin.reflect.KClass<?>>> getRequiredTypeConverterClasses() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<kotlin.reflect.KClass<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<androidx.room.migration.Migration> createAutoMigrations(@org.jetbrains.annotations.NotNull()
    java.util.Map<kotlin.reflect.KClass<? extends androidx.room.migration.AutoMigrationSpec>, ? extends androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public dev.therapscallion.fetchinterview.storage.HiringItemDao getHiringItemDao() {
        return null;
    }
}