package com.robinhood.android.lists.p173ui.deletelist;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.udf.UiEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteCuratedListDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/deletelist/DeleteCuratedListDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/lists/ui/deletelist/DeleteCuratedListState;", "Lcom/robinhood/android/udf/HasSavedState;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/store/lists/store/CuratedListStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "listId", "Ljava/util/UUID;", "getListId", "()Ljava/util/UUID;", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "getOwnerType", "()Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "onResume", "", "setIsDeletingList", "isDeletingList", "", "deleteList", "id", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DeleteCuratedListDuxo extends OldBaseDuxo<DeleteCuratedListState> implements HasSavedState {
    private final CuratedListStore curatedListStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeleteCuratedListDuxo(CuratedListStore curatedListStore, SavedStateHandle savedStateHandle) {
        super(new DeleteCuratedListState(null, false, null, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.curatedListStore = curatedListStore;
        this.savedStateHandle = savedStateHandle;
    }

    private final UUID getListId() {
        return ((LegacyDialogFragmentKey.DeleteCuratedList) INSTANCE.getArgs((HasSavedState) this)).getListId();
    }

    private final ApiCuratedList.OwnerType getOwnerType() {
        return ((LegacyDialogFragmentKey.DeleteCuratedList) INSTANCE.getArgs((HasSavedState) this)).getListOwnerType();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.curatedListStore.refreshList(true, getListId(), getOwnerType());
        LifecycleHost.DefaultImpls.bind$default(this, this.curatedListStore.streamCuratedList(getListId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.deletelist.DeleteCuratedListDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteCuratedListDuxo.onResume$lambda$1(this.f$0, (CuratedList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(DeleteCuratedListDuxo deleteCuratedListDuxo, final CuratedList curatedList) {
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        deleteCuratedListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.deletelist.DeleteCuratedListDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteCuratedListDuxo.onResume$lambda$1$lambda$0(curatedList, (DeleteCuratedListState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeleteCuratedListState onResume$lambda$1$lambda$0(CuratedList curatedList, DeleteCuratedListState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DeleteCuratedListState.copy$default(applyMutation, curatedList, false, null, null, 14, null);
    }

    private final void setIsDeletingList(final boolean isDeletingList) {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.deletelist.DeleteCuratedListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteCuratedListDuxo.setIsDeletingList$lambda$2(isDeletingList, (DeleteCuratedListState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeleteCuratedListState setIsDeletingList$lambda$2(boolean z, DeleteCuratedListState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DeleteCuratedListState.copy$default(applyMutation, null, z, null, null, 13, null);
    }

    public final void deleteList(UUID id, ApiCuratedList.OwnerType ownerType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        setIsDeletingList(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.curatedListStore.deleteList(id, ownerType), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.lists.ui.deletelist.DeleteCuratedListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeleteCuratedListDuxo.deleteList$lambda$4(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.deletelist.DeleteCuratedListDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteCuratedListDuxo.deleteList$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteList$lambda$4(DeleteCuratedListDuxo deleteCuratedListDuxo) {
        deleteCuratedListDuxo.setIsDeletingList(false);
        deleteCuratedListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.deletelist.DeleteCuratedListDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteCuratedListDuxo.deleteList$lambda$4$lambda$3((DeleteCuratedListState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeleteCuratedListState deleteList$lambda$4$lambda$3(DeleteCuratedListState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DeleteCuratedListState.copy$default(applyMutation, null, false, null, new UiEvent(Unit.INSTANCE), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteList$lambda$6(DeleteCuratedListDuxo deleteCuratedListDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        deleteCuratedListDuxo.setIsDeletingList(false);
        deleteCuratedListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.deletelist.DeleteCuratedListDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteCuratedListDuxo.deleteList$lambda$6$lambda$5(throwable, (DeleteCuratedListState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeleteCuratedListState deleteList$lambda$6$lambda$5(Throwable th, DeleteCuratedListState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DeleteCuratedListState.copy$default(applyMutation, null, false, new UiEvent(th), null, 11, null);
    }

    /* compiled from: DeleteCuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/deletelist/DeleteCuratedListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/lists/ui/deletelist/DeleteCuratedListDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$DeleteCuratedList;", "<init>", "()V", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DeleteCuratedListDuxo, LegacyDialogFragmentKey.DeleteCuratedList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.DeleteCuratedList getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyDialogFragmentKey.DeleteCuratedList) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.DeleteCuratedList getArgs(DeleteCuratedListDuxo deleteCuratedListDuxo) {
            return (LegacyDialogFragmentKey.DeleteCuratedList) DuxoCompanion.DefaultImpls.getArgs(this, deleteCuratedListDuxo);
        }
    }
}
