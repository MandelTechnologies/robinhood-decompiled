package com.robinhood.viewmode;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.data.prefs.ViewModePref;
import com.robinhood.android.common.extensions.CuratedListViewModes;
import com.robinhood.android.common.extensions.SecurityViewModes;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.lists.prefs.OptionsWatchlistViewModePref;
import com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.utils.Optional;
import com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment;
import com.robinhood.viewmode.ViewModeSelectionType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewModeSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001eB5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/viewmode/ViewModeSelectionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "viewModePreference", "Lcom/robinhood/prefs/StringPreference;", "optionsWatchlistViewModePref", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "listId", "Ljava/util/UUID;", "getListId", "()Ljava/util/UUID;", "viewModeSelectionType", "Lcom/robinhood/viewmode/ViewModeSelectionType;", "getViewModeSelectionType", "()Lcom/robinhood/viewmode/ViewModeSelectionType;", "onCreate", "", "setSecurityViewMode", "securityViewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "Companion", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ViewModeSelectionDuxo extends OldBaseDuxo<ViewModeSelectionViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CuratedListItemViewModeStore curatedListItemViewModeStore;
    private final CuratedListStore curatedListStore;
    private StringPreference optionsWatchlistViewModePref;
    private final SavedStateHandle savedStateHandle;
    private StringPreference viewModePreference;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewModeSelectionDuxo(@ViewModePref StringPreference viewModePreference, @OptionsWatchlistViewModePref StringPreference optionsWatchlistViewModePref, CuratedListStore curatedListStore, CuratedListItemViewModeStore curatedListItemViewModeStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(viewModePreference, "viewModePreference");
        Intrinsics.checkNotNullParameter(optionsWatchlistViewModePref, "optionsWatchlistViewModePref");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Object[] objArr = 0 == true ? 1 : 0;
        super(new ViewModeSelectionViewState(null, ((ViewModeSelectionBottomSheetFragment.Args) INSTANCE.getArgs(savedStateHandle)).getViewModeSelectionType(), 1, 0 == true ? 1 : 0), objArr, 2, 0 == true ? 1 : 0);
        this.viewModePreference = viewModePreference;
        this.optionsWatchlistViewModePref = optionsWatchlistViewModePref;
        this.curatedListStore = curatedListStore;
        this.curatedListItemViewModeStore = curatedListItemViewModeStore;
        this.savedStateHandle = savedStateHandle;
    }

    private final UUID getListId() {
        return ((ViewModeSelectionBottomSheetFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getListId();
    }

    private final ViewModeSelectionType getViewModeSelectionType() {
        return ((ViewModeSelectionBottomSheetFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getViewModeSelectionType();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        ViewModeSelectionType viewModeSelectionType = getViewModeSelectionType();
        if (Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.AllCuratedLists.INSTANCE)) {
            LifecycleHost.DefaultImpls.bind$default(this, this.curatedListItemViewModeStore.streamUniversalViewMode(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.viewmode.ViewModeSelectionDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ViewModeSelectionDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.HoldingsAndCrypto.INSTANCE) || (viewModeSelectionType instanceof ViewModeSelectionType.PositionsV2)) {
            applyMutation(new Function1() { // from class: com.robinhood.viewmode.ViewModeSelectionDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ViewModeSelectionDuxo.onCreate$lambda$2(this.f$0, (ViewModeSelectionViewState) obj);
                }
            });
            return;
        }
        if ((viewModeSelectionType instanceof ViewModeSelectionType.CuratedList) || Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.FuturesCuratedRhList.INSTANCE)) {
            CuratedListItemViewModeStore curatedListItemViewModeStore = this.curatedListItemViewModeStore;
            UUID listId = getListId();
            Intrinsics.checkNotNull(listId);
            LifecycleHost.DefaultImpls.bind$default(this, curatedListItemViewModeStore.streamCuratedListItemViewModeOrDefault(listId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.viewmode.ViewModeSelectionDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ViewModeSelectionDuxo.onCreate$lambda$4(this.f$0, (CuratedListViewMode) obj);
                }
            });
            return;
        }
        if (!Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.OptionsWatchlist.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        applyMutation(new Function1() { // from class: com.robinhood.viewmode.ViewModeSelectionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewModeSelectionDuxo.onCreate$lambda$6(this.f$0, (ViewModeSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(ViewModeSelectionDuxo viewModeSelectionDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        CuratedListViewMode curatedListViewMode = (CuratedListViewMode) optional.component1();
        final SecurityViewMode securityViewMode = curatedListViewMode != null ? CuratedListViewModes.toSecurityViewMode(curatedListViewMode) : null;
        viewModeSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.viewmode.ViewModeSelectionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewModeSelectionDuxo.onCreate$lambda$1$lambda$0(securityViewMode, (ViewModeSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModeSelectionViewState onCreate$lambda$1$lambda$0(SecurityViewMode securityViewMode, ViewModeSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ViewModeSelectionViewState.copy$default(applyMutation, securityViewMode, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModeSelectionViewState onCreate$lambda$2(ViewModeSelectionDuxo viewModeSelectionDuxo, ViewModeSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        String str = viewModeSelectionDuxo.viewModePreference.get();
        Intrinsics.checkNotNull(str);
        return ViewModeSelectionViewState.copy$default(applyMutation, SecurityViewMode.valueOf(str), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(ViewModeSelectionDuxo viewModeSelectionDuxo, final CuratedListViewMode viewMode) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        viewModeSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.viewmode.ViewModeSelectionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewModeSelectionDuxo.onCreate$lambda$4$lambda$3(viewMode, (ViewModeSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModeSelectionViewState onCreate$lambda$4$lambda$3(CuratedListViewMode curatedListViewMode, ViewModeSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ViewModeSelectionViewState.copy$default(applyMutation, CuratedListViewModes.toSecurityViewMode(curatedListViewMode), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModeSelectionViewState onCreate$lambda$6(ViewModeSelectionDuxo viewModeSelectionDuxo, ViewModeSelectionViewState applyMutation) {
        SecurityViewMode securityViewModeValueOf;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        String str = viewModeSelectionDuxo.optionsWatchlistViewModePref.get();
        if (str == null || (securityViewModeValueOf = SecurityViewMode.valueOf(str)) == null) {
            securityViewModeValueOf = SecurityViewMode.LAST_PRICE;
        }
        return ViewModeSelectionViewState.copy$default(applyMutation, securityViewModeValueOf, null, 2, null);
    }

    public final void setSecurityViewMode(final SecurityViewMode securityViewMode) {
        Intrinsics.checkNotNullParameter(securityViewMode, "securityViewMode");
        String string2 = securityViewMode.toString();
        ViewModeSelectionType viewModeSelectionType = getViewModeSelectionType();
        if (Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.HoldingsAndCrypto.INSTANCE) || (viewModeSelectionType instanceof ViewModeSelectionType.PositionsV2)) {
            this.viewModePreference.set(string2);
        } else if (Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.AllCuratedLists.INSTANCE)) {
            this.curatedListStore.updateAllViewModes(SecurityViewModes.toCuratedListViewMode(securityViewMode));
        } else if ((viewModeSelectionType instanceof ViewModeSelectionType.CuratedList) || Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.FuturesCuratedRhList.INSTANCE)) {
            CuratedListItemViewModeStore curatedListItemViewModeStore = this.curatedListItemViewModeStore;
            UUID listId = getListId();
            Intrinsics.checkNotNull(listId);
            curatedListItemViewModeStore.updateViewMode(listId, SecurityViewModes.toCuratedListViewMode(securityViewMode));
        } else {
            if (!Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.OptionsWatchlist.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            this.optionsWatchlistViewModePref.set(string2);
        }
        applyMutation(new Function1() { // from class: com.robinhood.viewmode.ViewModeSelectionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewModeSelectionDuxo.setSecurityViewMode$lambda$7(securityViewMode, (ViewModeSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModeSelectionViewState setSecurityViewMode$lambda$7(SecurityViewMode securityViewMode, ViewModeSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ViewModeSelectionViewState.copy$default(applyMutation, securityViewMode, null, 2, null);
    }

    /* compiled from: ViewModeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/viewmode/ViewModeSelectionDuxo;", "Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Args;", "<init>", "()V", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ViewModeSelectionDuxo, ViewModeSelectionBottomSheetFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ViewModeSelectionBottomSheetFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ViewModeSelectionBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ViewModeSelectionBottomSheetFragment.Args getArgs(ViewModeSelectionDuxo viewModeSelectionDuxo) {
            return (ViewModeSelectionBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, viewModeSelectionDuxo);
        }
    }
}
