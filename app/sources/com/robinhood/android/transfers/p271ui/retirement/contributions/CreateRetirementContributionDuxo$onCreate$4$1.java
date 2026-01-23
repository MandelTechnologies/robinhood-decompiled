package com.robinhood.android.transfers.p271ui.retirement.contributions;

import com.robinhood.android.models.retirement.api.contributions.ApiRetirementContributionsResponse;
import com.robinhood.android.models.retirement.api.contributions.ContributionYear;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionEvent;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Year;

/* compiled from: CreateRetirementContributionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onCreate$4$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes9.dex */
final class CreateRetirementContributionDuxo$onCreate$4$1 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
    final /* synthetic */ List<TransferAccount> $accounts;
    final /* synthetic */ ApiRetirementContributionsResponse $screenInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CreateRetirementContributionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateRetirementContributionDuxo$onCreate$4$1(ApiRetirementContributionsResponse apiRetirementContributionsResponse, List<TransferAccount> list, CreateRetirementContributionDuxo createRetirementContributionDuxo, Continuation<? super CreateRetirementContributionDuxo$onCreate$4$1> continuation) {
        super(2, continuation);
        this.$screenInfo = apiRetirementContributionsResponse;
        this.$accounts = list;
        this.this$0 = createRetirementContributionDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateRetirementContributionDuxo$onCreate$4$1 createRetirementContributionDuxo$onCreate$4$1 = new CreateRetirementContributionDuxo$onCreate$4$1(this.$screenInfo, this.$accounts, this.this$0, continuation);
        createRetirementContributionDuxo$onCreate$4$1.L$0 = obj;
        return createRetirementContributionDuxo$onCreate$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
        return ((CreateRetirementContributionDuxo$onCreate$4$1) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0061 A[EDGE_INSN: B:54:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x002e->B:58:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[LOOP:0: B:11:0x002e->B:58:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Year yearM3433of;
        Object next;
        Object next2;
        boolean z;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CreateRetirementContributionDataState createRetirementContributionDataState = (CreateRetirementContributionDataState) this.L$0;
        boolean z2 = this.$screenInfo.getHasMultipleContributableYears() && createRetirementContributionDataState.getTaxYear() == null;
        List<TransferAccount> list = this.$accounts;
        CreateRetirementContributionDuxo createRetirementContributionDuxo = this.this$0;
        Iterator<T> it = list.iterator();
        while (true) {
            yearM3433of = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TransferAccount transferAccount = (TransferAccount) next;
            if (transferAccount.getType() != ApiTransferAccount.TransferAccountType.ACH) {
                z = false;
                if (!z) {
                    break;
                }
            } else {
                String str = createRetirementContributionDuxo.defaultAchRelationshipPref.get();
                if (str != null ? Intrinsics.areEqual(str, transferAccount.getAccountId()) : true) {
                    z = true;
                }
                if (!z) {
                }
            }
        }
        TransferAccount transferAccount2 = (TransferAccount) next;
        Iterator<T> it2 = this.$accounts.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.areEqual(((TransferAccount) next2).getAccountNumber(), createRetirementContributionDataState.getAccountNumber())) {
                break;
            }
        }
        TransferAccount transferAccount3 = (TransferAccount) next2;
        ContributionYear contributionYear = (ContributionYear) CollectionsKt.firstOrNull((List) this.$screenInfo.getContributableYears());
        int taxYear = contributionYear != null ? contributionYear.getTaxYear() : ((ContributionYear) CollectionsKt.first((List) this.$screenInfo.getContributionYears())).getTaxYear();
        if (z2 && transferAccount3 != null) {
            this.this$0.submit(new CreateRetirementContributionEvent.SelectYearEvent(transferAccount3));
        }
        TransferAccount sourceAccount = createRetirementContributionDataState.getSourceAccount();
        if (sourceAccount != null) {
            transferAccount2 = sourceAccount;
        }
        if (createRetirementContributionDataState.getTaxYear() != null) {
            yearM3433of = createRetirementContributionDataState.getTaxYear();
        } else if (!z2) {
            yearM3433of = Year.m3433of(taxYear);
        }
        return CreateRetirementContributionDataState.copy$default(createRetirementContributionDataState, null, null, yearM3433of, false, this.$accounts, transferAccount2, transferAccount3, null, false, null, null, false, false, null, false, null, null, this.$screenInfo, false, false, false, null, null, false, false, null, false, 134086539, null);
    }
}
