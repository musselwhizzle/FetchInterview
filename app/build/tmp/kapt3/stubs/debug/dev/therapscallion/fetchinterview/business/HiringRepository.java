package dev.therapscallion.fetchinterview.business;

import dev.therapscallion.fetchinterview.network.HiringApi;
import dev.therapscallion.fetchinterview.storage.HiringItemDao;
import dev.therapscallion.fetchinterview.storage.HiringItemEntity;
import dev.therapscallion.fetchinterview.storage.SqlSort;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Ldev/therapscallion/fetchinterview/business/HiringRepository;", "", "fetchApi", "Ldev/therapscallion/fetchinterview/network/HiringApi;", "hiringDao", "Ldev/therapscallion/fetchinterview/storage/HiringItemDao;", "(Ldev/therapscallion/fetchinterview/network/HiringApi;Ldev/therapscallion/fetchinterview/storage/HiringItemDao;)V", "consumeHiringList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowHiringItems", "Lkotlinx/coroutines/flow/Flow;", "", "Ldev/therapscallion/fetchinterview/storage/HiringItemEntity;", "sortListId", "Ldev/therapscallion/fetchinterview/storage/SqlSort;", "sortName", "app_debug"})
public final class HiringRepository {
    @org.jetbrains.annotations.NotNull()
    private final dev.therapscallion.fetchinterview.network.HiringApi fetchApi = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.therapscallion.fetchinterview.storage.HiringItemDao hiringDao = null;
    
    @javax.inject.Inject()
    public HiringRepository(@org.jetbrains.annotations.NotNull()
    dev.therapscallion.fetchinterview.network.HiringApi fetchApi, @org.jetbrains.annotations.NotNull()
    dev.therapscallion.fetchinterview.storage.HiringItemDao hiringDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity>> flowHiringItems(@org.jetbrains.annotations.NotNull()
    dev.therapscallion.fetchinterview.storage.SqlSort sortListId, @org.jetbrains.annotations.NotNull()
    dev.therapscallion.fetchinterview.storage.SqlSort sortName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object consumeHiringList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}