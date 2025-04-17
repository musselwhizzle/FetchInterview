package dev.therapscallion.fetchinterview.network;

import retrofit2.Response;
import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2 = {"Ldev/therapscallion/fetchinterview/network/HiringApi;", "", "getHiring", "Lretrofit2/Response;", "", "Ldev/therapscallion/fetchinterview/network/HiringApi$Companion$ApiItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface HiringApi {
    @org.jetbrains.annotations.NotNull()
    public static final dev.therapscallion.fetchinterview.network.HiringApi.Companion Companion = null;
    
    @retrofit2.http.GET(value = "/hiring.json")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHiring(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<dev.therapscallion.fetchinterview.network.HiringApi.Companion.ApiItem>>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Ldev/therapscallion/fetchinterview/network/HiringApi$Companion;", "", "()V", "ApiItem", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Ldev/therapscallion/fetchinterview/network/HiringApi$Companion$ApiItem;", "", "id", "", "listId", "name", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getListId", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Ldev/therapscallion/fetchinterview/network/HiringApi$Companion$ApiItem;", "equals", "", "other", "hashCode", "toString", "app_debug"})
        public static final class ApiItem {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer listId = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String name = null;
            
            public ApiItem(@org.jetbrains.annotations.Nullable()
            java.lang.Integer id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer listId, @org.jetbrains.annotations.Nullable()
            java.lang.String name) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getListId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getName() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final dev.therapscallion.fetchinterview.network.HiringApi.Companion.ApiItem copy(@org.jetbrains.annotations.Nullable()
            java.lang.Integer id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer listId, @org.jetbrains.annotations.Nullable()
            java.lang.String name) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
    }
}