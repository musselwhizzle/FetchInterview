package dev.therapscallion.fetchinterview.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import dev.therapscallion.fetchinterview.databinding.ItemHiringBinding;
import dev.therapscallion.fetchinterview.storage.HiringItemEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Ldev/therapscallion/fetchinterview/ui/HiringListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/therapscallion/fetchinterview/ui/HiringListAdapter$Companion$ItemHolder;", "()V", "value", "", "Ldev/therapscallion/fetchinterview/storage/HiringItemEntity;", "source", "getSource", "()Ljava/util/List;", "setSource", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_debug"})
public final class HiringListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<dev.therapscallion.fetchinterview.ui.HiringListAdapter.Companion.ItemHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity> source;
    @org.jetbrains.annotations.NotNull()
    public static final dev.therapscallion.fetchinterview.ui.HiringListAdapter.Companion Companion = null;
    
    public HiringListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity> getSource() {
        return null;
    }
    
    public final void setSource(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.therapscallion.fetchinterview.storage.HiringItemEntity> value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public dev.therapscallion.fetchinterview.ui.HiringListAdapter.Companion.ItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    dev.therapscallion.fetchinterview.ui.HiringListAdapter.Companion.ItemHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Ldev/therapscallion/fetchinterview/ui/HiringListAdapter$Companion;", "", "()V", "ItemHolder", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ldev/therapscallion/fetchinterview/ui/HiringListAdapter$Companion$ItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item", "Ldev/therapscallion/fetchinterview/databinding/ItemHiringBinding;", "(Ldev/therapscallion/fetchinterview/databinding/ItemHiringBinding;)V", "bind", "", "data", "Ldev/therapscallion/fetchinterview/storage/HiringItemEntity;", "app_debug"})
        public static final class ItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final dev.therapscallion.fetchinterview.databinding.ItemHiringBinding item = null;
            
            public ItemHolder(@org.jetbrains.annotations.NotNull()
            dev.therapscallion.fetchinterview.databinding.ItemHiringBinding item) {
                super(null);
            }
            
            public final void bind(@org.jetbrains.annotations.Nullable()
            dev.therapscallion.fetchinterview.storage.HiringItemEntity data) {
            }
        }
    }
}