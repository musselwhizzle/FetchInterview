package dev.therapscallion.fetchinterview.ui;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dev.therapscallion.fetchinterview.business.HiringRepository;
import dev.therapscallion.fetchinterview.storage.HiringItemEntity;
import dev.therapscallion.fetchinterview.storage.SqlSort;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ*\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Ldev/therapscallion/fetchinterview/ui/HiringViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Ldev/therapscallion/fetchinterview/business/HiringRepository;", "(Ldev/therapscallion/fetchinterview/business/HiringRepository;)V", "<set-?>", "Ldev/therapscallion/fetchinterview/storage/SqlSort;", "listIdSortOrder", "getListIdSortOrder", "()Ldev/therapscallion/fetchinterview/storage/SqlSort;", "nameSortOrder", "getNameSortOrder", "consumeHiringList", "", "getHiringFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Ldev/therapscallion/fetchinterview/storage/HiringItemEntity;", "listId", "name", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HiringViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final dev.therapscallion.fetchinterview.business.HiringRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private dev.therapscallion.fetchinterview.storage.SqlSort listIdSortOrder = dev.therapscallion.fetchinterview.storage.SqlSort.ASC;
    @org.jetbrains.annotations.NotNull()
    private dev.therapscallion.fetchinterview.storage.SqlSort nameSortOrder = dev.therapscallion.fetchinterview.storage.SqlSort.ASC;
    
    @javax.inject.Inject()
    public HiringViewModel(@org.jetbrains.annotations.NotNull()
    dev.therapscallion.fetchinterview.business.HiringRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.therapscallion.fetchinterview.storage.SqlSort getListIdSortOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.therapscallion.fetchinterview.storage.SqlSort getNameSortOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity>> getHiringFlow(@org.jetbrains.annotations.Nullable()
    dev.therapscallion.fetchinterview.storage.SqlSort listId, @org.jetbrains.annotations.Nullable()
    dev.therapscallion.fetchinterview.storage.SqlSort name) {
        return null;
    }
    
    public final void consumeHiringList() {
    }
}