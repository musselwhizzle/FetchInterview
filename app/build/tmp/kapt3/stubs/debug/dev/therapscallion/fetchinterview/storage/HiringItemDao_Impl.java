package dev.therapscallion.fetchinterview.storage;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteQuery;
import javax.annotation.processing.Generated;
import kotlin.Int;
import kotlin.String;
import kotlin.Suppress;
import kotlin.Unit;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Ldev/therapscallion/fetchinterview/storage/HiringItemDao_Impl;", "Ldev/therapscallion/fetchinterview/storage/HiringItemDao;", "__db", "Landroidx/room/RoomDatabase;", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfHiringItemEntity", "Landroidx/room/EntityInsertAdapter;", "Ldev/therapscallion/fetchinterview/storage/HiringItemEntity;", "__entityStatementConverter_devTherapscallionFetchinterviewStorageHiringItemEntity", "statement", "Landroidx/sqlite/SQLiteStatement;", "cleanAndInsert", "", "items", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowHiringItems", "Lkotlinx/coroutines/flow/Flow;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "insert", "Companion", "app_debug"})
@javax.annotation.processing.Generated(value = {"androidx.room.RoomProcessor"})
@kotlin.Suppress(names = {"UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"})
public final class HiringItemDao_Impl implements dev.therapscallion.fetchinterview.storage.HiringItemDao {
    @org.jetbrains.annotations.NotNull()
    private final androidx.room.RoomDatabase __db = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.room.EntityInsertAdapter<dev.therapscallion.fetchinterview.storage.HiringItemEntity> __insertAdapterOfHiringItemEntity = null;
    @org.jetbrains.annotations.NotNull()
    public static final dev.therapscallion.fetchinterview.storage.HiringItemDao_Impl.Companion Companion = null;
    
    public HiringItemDao_Impl(@org.jetbrains.annotations.NotNull()
    androidx.room.RoomDatabase __db) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity> items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object cleanAndInsert(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity> items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity>> flowHiringItems(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query) {
        return null;
    }
    
    private final dev.therapscallion.fetchinterview.storage.HiringItemEntity __entityStatementConverter_devTherapscallionFetchinterviewStorageHiringItemEntity(androidx.sqlite.SQLiteStatement statement) {
        return null;
    }
    
    @java.lang.Override()
    @androidx.room.RawQuery(observedEntities = {dev.therapscallion.fetchinterview.storage.HiringItemEntity.class})
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity>> flowHiringItems(@org.jetbrains.annotations.NotNull()
    dev.therapscallion.fetchinterview.storage.SqlSort sortListId, @org.jetbrains.annotations.NotNull()
    dev.therapscallion.fetchinterview.storage.SqlSort sortName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\u00a8\u0006\u0006"}, d2 = {"Ldev/therapscallion/fetchinterview/storage/HiringItemDao_Impl$Companion;", "", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<kotlin.reflect.KClass<?>> getRequiredConverters() {
            return null;
        }
    }
}