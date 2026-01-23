package com.robinhood.android.transfers.ach.p265ui;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.udf.UiEvent;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferAchRelationshipListDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListViewState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;)V", "onStart", "", Fields4.TYPE, "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateTransferAchRelationshipListDuxo extends OldBaseDuxo<CreateTransferAchRelationshipListViewState> {
    public static final int $stable = 8;
    private final AchRelationshipStore achRelationshipStore;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateTransferAchRelationshipListDuxo(AchRelationshipStore achRelationshipStore) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        super(new CreateTransferAchRelationshipListViewState(null, objArr, 3, 0 == true ? 1 : 0), objArr2, 2, 0 == true ? 1 : 0);
        this.achRelationshipStore = achRelationshipStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        AchRelationshipStore.refresh$default(this.achRelationshipStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getLinkedAchRelationships(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferAchRelationshipListDuxo.onStart$lambda$1(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CreateTransferAchRelationshipListDuxo createTransferAchRelationshipListDuxo, final List achRelationships) {
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        createTransferAchRelationshipListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferAchRelationshipListDuxo.onStart$lambda$1$lambda$0(achRelationships, (CreateTransferAchRelationshipListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferAchRelationshipListViewState onStart$lambda$1$lambda$0(List list, CreateTransferAchRelationshipListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferAchRelationshipListViewState.copy$default(applyMutation, list, null, 2, null);
    }

    public final void select(final AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        if (!achRelationship.getVerified()) {
            if (achRelationship.getNeedToVerifyMicroDeposits()) {
                applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListDuxo$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferAchRelationshipListDuxo.select$lambda$2(achRelationship, (CreateTransferAchRelationshipListViewState) obj);
                    }
                });
                return;
            } else {
                applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListDuxo$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferAchRelationshipListDuxo.select$lambda$3(achRelationship, (CreateTransferAchRelationshipListViewState) obj);
                    }
                });
                return;
            }
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferAchRelationshipListDuxo.select$lambda$4(achRelationship, (CreateTransferAchRelationshipListViewState) obj);
            }
        });
        this.achRelationshipStore.setDefaultAchRelationship(achRelationship.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferAchRelationshipListViewState select$lambda$2(AchRelationship achRelationship, CreateTransferAchRelationshipListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferAchRelationshipListViewState.copy$default(applyMutation, null, new UiEvent(new SelectionResult(achRelationship, CreateTransferAchRelationshipListDuxo2.NEED_TO_VERIFY_MICRODEPOSITS)), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferAchRelationshipListViewState select$lambda$3(AchRelationship achRelationship, CreateTransferAchRelationshipListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferAchRelationshipListViewState.copy$default(applyMutation, null, new UiEvent(new SelectionResult(achRelationship, CreateTransferAchRelationshipListDuxo2.UNVERIFIED_BUT_NO_PATH)), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferAchRelationshipListViewState select$lambda$4(AchRelationship achRelationship, CreateTransferAchRelationshipListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferAchRelationshipListViewState.copy$default(applyMutation, null, new UiEvent(new SelectionResult(achRelationship, CreateTransferAchRelationshipListDuxo2.ACCEPTED)), 1, null);
    }
}
