package dev.therapscallion.fetchinterview.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import dagger.hilt.android.AndroidEntryPoint;
import dev.therapscallion.fetchinterview.R;
import dev.therapscallion.fetchinterview.databinding.ActivityMainBinding;
import dev.therapscallion.fetchinterview.storage.SqlSort;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Ldev/therapscallion/fetchinterview/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Ldev/therapscallion/fetchinterview/ui/HiringListAdapter;", "binding", "Ldev/therapscallion/fetchinterview/databinding/ActivityMainBinding;", "listJob", "Lkotlinx/coroutines/Job;", "viewModel", "Ldev/therapscallion/fetchinterview/ui/HiringViewModel;", "getViewModel", "()Ldev/therapscallion/fetchinterview/ui/HiringViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindList", "", "listIdSort", "Ldev/therapscallion/fetchinterview/storage/SqlSort;", "nameSort", "getArrowFromSortOrder", "", "sort", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private dev.therapscallion.fetchinterview.databinding.ActivityMainBinding binding;
    private dev.therapscallion.fetchinterview.ui.HiringListAdapter adapter;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job listJob;
    
    public MainActivity() {
        super();
    }
    
    private final dev.therapscallion.fetchinterview.ui.HiringViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindList(dev.therapscallion.fetchinterview.storage.SqlSort listIdSort, dev.therapscallion.fetchinterview.storage.SqlSort nameSort) {
    }
    
    private final int getArrowFromSortOrder(dev.therapscallion.fetchinterview.storage.SqlSort sort) {
        return 0;
    }
}