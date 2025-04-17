package dev.therapscallion.fetchinterview.storage;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Transaction;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0097@\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\'J(\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0017J\u001c\u0010\u0012\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00a7@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\u0013"}, d2 = {"Ldev/therapscallion/fetchinterview/storage/HiringItemDao;", "", "buildHiringItemsQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "sortListId", "Ldev/therapscallion/fetchinterview/storage/SqlSort;", "sortName", "cleanAndInsert", "", "items", "", "Ldev/therapscallion/fetchinterview/storage/HiringItemEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowHiringItems", "Lkotlinx/coroutines/flow/Flow;", "query", "insert", "app_debug"})
@androidx.room.Dao()
public abstract interface HiringItemDao {
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object cleanAndInsert(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity> items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity> items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM HiringItemEntity")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.RawQuery(observedEntities = {dev.therapscallion.fetchinterview.storage.HiringItemEntity.class})
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity>> flowHiringItems(@org.jetbrains.annotations.NotNull()
    dev.therapscallion.fetchinterview.storage.SqlSort sortListId, @org.jetbrains.annotations.NotNull()
    dev.therapscallion.fetchinterview.storage.SqlSort sortName);
    
    @androidx.room.RawQuery(observedEntities = {dev.therapscallion.fetchinterview.storage.HiringItemEntity.class})
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity>> flowHiringItems(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object cleanAndInsert(@org.jetbrains.annotations.NotNull()
        dev.therapscallion.fetchinterview.storage.HiringItemDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity> items, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @androidx.room.RawQuery(observedEntities = {dev.therapscallion.fetchinterview.storage.HiringItemEntity.class})
        @org.jetbrains.annotations.NotNull()
        public static kotlinx.coroutines.flow.Flow<java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity>> flowHiringItems(@org.jetbrains.annotations.NotNull()
        dev.therapscallion.fetchinterview.storage.HiringItemDao $this, @org.jetbrains.annotations.NotNull()
        dev.therapscallion.fetchinterview.storage.SqlSort sortListId, @org.jetbrains.annotations.NotNull()
        dev.therapscallion.fetchinterview.storage.SqlSort sortName) {
            return null;
        }
        
        private static androidx.sqlite.db.SupportSQLiteQuery buildHiringItemsQuery(dev.therapscallion.fetchinterview.storage.HiringItemDao $this, dev.therapscallion.fetchinterview.storage.SqlSort sortListId, dev.therapscallion.fetchinterview.storage.SqlSort sortName) {
            return null;
        }
    }
}