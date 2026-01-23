package com.robinhood.android.shareholderexperience.eventslist;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsPageStore;
import com.robinhood.shareholderx.models.p401db.ShareholderEventsPage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareholderEventsPageDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "shareholderEventsPageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventsPageStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventsPageStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "filterEventsPage", "filter", "", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ShareholderEventsPageDuxo extends OldBaseDuxo<ShareholderEventsPageViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final ShareholderEventsPageStore shareholderEventsPageStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShareholderEventsPageDuxo(ShareholderEventsPageStore shareholderEventsPageStore, SavedStateHandle savedStateHandle) {
        super(new ShareholderEventsPageViewState(null, false, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(shareholderEventsPageStore, "shareholderEventsPageStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.shareholderEventsPageStore = shareholderEventsPageStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.shareholderEventsPageStore.getStreamEventsPage().asObservable(((LegacyFragmentKey.ShareholderEventsPage) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareholderEventsPageDuxo.onStart$lambda$1(this.f$0, (ShareholderEventsPage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(ShareholderEventsPageDuxo shareholderEventsPageDuxo, final ShareholderEventsPage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        shareholderEventsPageDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareholderEventsPageDuxo.onStart$lambda$1$lambda$0(it, (ShareholderEventsPageViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShareholderEventsPageViewState onStart$lambda$1$lambda$0(ShareholderEventsPage shareholderEventsPage, ShareholderEventsPageViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(shareholderEventsPage, false);
    }

    public final void filterEventsPage(String filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.shareholderEventsPageStore.filterEventsPage(((LegacyFragmentKey.ShareholderEventsPage) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId(), filter);
        applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareholderEventsPageDuxo.filterEventsPage$lambda$2((ShareholderEventsPageViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShareholderEventsPageViewState filterEventsPage$lambda$2(ShareholderEventsPageViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ShareholderEventsPageViewState.copy$default(applyMutation, null, true, 1, null);
    }

    /* compiled from: ShareholderEventsPageDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderEventsPage;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ShareholderEventsPageDuxo, LegacyFragmentKey.ShareholderEventsPage> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.ShareholderEventsPage getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.ShareholderEventsPage) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.ShareholderEventsPage getArgs(ShareholderEventsPageDuxo shareholderEventsPageDuxo) {
            return (LegacyFragmentKey.ShareholderEventsPage) DuxoCompanion.DefaultImpls.getArgs(this, shareholderEventsPageDuxo);
        }
    }
}
