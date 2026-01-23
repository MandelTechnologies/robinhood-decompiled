package com.robinhood.android.acatsin.availabledestinations;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount2;
import com.robinhood.models.api.bonfire.ApiAvailableAccount;
import com.robinhood.models.api.bonfire.ApiAvailableDestinationsResponse;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInAvailableDestinationsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$onStart$1$1", m3645f = "AcatsInAvailableDestinationsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInAvailableDestinationsDuxo2 extends ContinuationImpl7 implements Function2<AcatsInAvailableDestinationsDataState, Continuation<? super AcatsInAvailableDestinationsDataState>, Object> {
    final /* synthetic */ ApiAvailableDestinationsResponse $availableAccountsPage;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInAvailableDestinationsDuxo2(ApiAvailableDestinationsResponse apiAvailableDestinationsResponse, Continuation<? super AcatsInAvailableDestinationsDuxo2> continuation) {
        super(2, continuation);
        this.$availableAccountsPage = apiAvailableDestinationsResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInAvailableDestinationsDuxo2 acatsInAvailableDestinationsDuxo2 = new AcatsInAvailableDestinationsDuxo2(this.$availableAccountsPage, continuation);
        acatsInAvailableDestinationsDuxo2.L$0 = obj;
        return acatsInAvailableDestinationsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInAvailableDestinationsDataState acatsInAvailableDestinationsDataState, Continuation<? super AcatsInAvailableDestinationsDataState> continuation) {
        return ((AcatsInAvailableDestinationsDuxo2) create(acatsInAvailableDestinationsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsInAvailableDestinationsDataState acatsInAvailableDestinationsDataState = (AcatsInAvailableDestinationsDataState) this.L$0;
        List<ApiAvailableAccount> available_accounts = this.$availableAccountsPage.getAvailable_accounts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_accounts, 10));
        Iterator<T> it = available_accounts.iterator();
        while (it.hasNext()) {
            arrayList.add(AvailableAccount2.toDbModel((ApiAvailableAccount) it.next()));
        }
        return AcatsInAvailableDestinationsDataState.copy$default(acatsInAvailableDestinationsDataState, false, arrayList, this.$availableAccountsPage.getSignup_selections(), this.$availableAccountsPage.getOther_selections(), null, this.$availableAccountsPage.getHeader_contents(), this.$availableAccountsPage.getSticky_footer_contents(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, null);
    }
}
