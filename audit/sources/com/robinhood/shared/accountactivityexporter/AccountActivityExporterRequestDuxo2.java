package com.robinhood.shared.accountactivityexporter;

import com.robinhood.models.p320db.Account;
import com.robinhood.utils.datetime.Instants;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import p479j$.time.LocalDate;

/* compiled from: AccountActivityExporterRequestDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$onStart$1$1", m3645f = "AccountActivityExporterRequestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class AccountActivityExporterRequestDuxo2 extends ContinuationImpl7 implements Function2<AccountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState>, Object> {
    final /* synthetic */ List<Account> $allAccounts;
    final /* synthetic */ Account $defaultAccount;
    final /* synthetic */ LocalDate $firstDayOfThisYear;
    final /* synthetic */ LocalDate $today;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountActivityExporterRequestDuxo2(List<Account> list, Account account, LocalDate localDate, LocalDate localDate2, Continuation<? super AccountActivityExporterRequestDuxo2> continuation) {
        super(2, continuation);
        this.$allAccounts = list;
        this.$defaultAccount = account;
        this.$firstDayOfThisYear = localDate;
        this.$today = localDate2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountActivityExporterRequestDuxo2 accountActivityExporterRequestDuxo2 = new AccountActivityExporterRequestDuxo2(this.$allAccounts, this.$defaultAccount, this.$firstDayOfThisYear, this.$today, continuation);
        accountActivityExporterRequestDuxo2.L$0 = obj;
        return accountActivityExporterRequestDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountActivityExporterRequestDataState accountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState> continuation) {
        return ((AccountActivityExporterRequestDuxo2) create(accountActivityExporterRequestDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AccountActivityExporterRequestDataState accountActivityExporterRequestDataState = (AccountActivityExporterRequestDataState) this.L$0;
        List<Account> list = this.$allAccounts;
        Account account = this.$defaultAccount;
        return AccountActivityExporterRequestDataState.copy$default(accountActivityExporterRequestDataState, list, account, (LocalDate) RangesKt.coerceAtLeast(this.$firstDayOfThisYear, Instants.toLocalDate$default(account.getCreatedAt(), null, 1, null)), this.$today, false, null, 48, null);
    }
}
