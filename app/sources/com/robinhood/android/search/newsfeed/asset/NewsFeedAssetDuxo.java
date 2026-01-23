package com.robinhood.android.search.newsfeed.asset;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedAssetDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/asset/NewsFeedAssetDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/search/newsfeed/asset/NewsFeedAssetViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "newsFeedAssetElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedAssetElementStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedAssetElementStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "assetId", "Ljava/util/UUID;", "getAssetId", "()Ljava/util/UUID;", "onResume", "", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NewsFeedAssetDuxo extends OldBaseDuxo<NewsFeedAssetViewState> implements HasSavedState {
    private final NewsFeedAssetElementStore newsFeedAssetElementStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public NewsFeedAssetDuxo(NewsFeedAssetElementStore newsFeedAssetElementStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(newsFeedAssetElementStore, "newsFeedAssetElementStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Object[] objArr = 0 == true ? 1 : 0;
        super(new NewsFeedAssetViewState(null, 1, 0 == true ? 1 : 0), objArr, 2, 0 == true ? 1 : 0);
        this.newsFeedAssetElementStore = newsFeedAssetElementStore;
        this.savedStateHandle = savedStateHandle;
    }

    private final UUID getAssetId() {
        return ((LegacyFragmentKey.NewsFeedAsset) INSTANCE.getArgs((HasSavedState) this)).getAssetId();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.newsFeedAssetElementStore.refresh(getAssetId(), false);
        LifecycleHost.DefaultImpls.bind$default(this, this.newsFeedAssetElementStore.streamNewsFeedElements(getAssetId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedAssetDuxo.onResume$lambda$1(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(NewsFeedAssetDuxo newsFeedAssetDuxo, final List elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        newsFeedAssetDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedAssetDuxo.onResume$lambda$1$lambda$0(elements, (NewsFeedAssetViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedAssetViewState onResume$lambda$1$lambda$0(List list, NewsFeedAssetViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(list);
    }

    /* compiled from: NewsFeedAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/asset/NewsFeedAssetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/search/newsfeed/asset/NewsFeedAssetDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedAsset;", "<init>", "()V", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<NewsFeedAssetDuxo, LegacyFragmentKey.NewsFeedAsset> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.NewsFeedAsset getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.NewsFeedAsset) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.NewsFeedAsset getArgs(NewsFeedAssetDuxo newsFeedAssetDuxo) {
            return (LegacyFragmentKey.NewsFeedAsset) DuxoCompanion.DefaultImpls.getArgs(this, newsFeedAssetDuxo);
        }
    }
}
