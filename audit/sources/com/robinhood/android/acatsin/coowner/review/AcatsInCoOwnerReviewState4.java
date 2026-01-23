package com.robinhood.android.acatsin.coowner.review;

import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.coowner.C7877R;
import com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewState5;
import com.robinhood.android.acatsin.review.ReviewAcatsInViewState;
import com.robinhood.android.acatsin.util.names.NamesOnAccount2;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AcatsInCoOwnerReviewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDataState;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState;", "<init>", "()V", "reduce", "dataState", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewStateProvider, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInCoOwnerReviewState4 implements StateProvider<AcatsInCoOwnerReviewDataState, AcatsInCoOwnerReviewState5> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AcatsInCoOwnerReviewState5 reduce(AcatsInCoOwnerReviewDataState dataState) {
        String firstName;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getAcatsTransfer() == null || dataState.getAccount() == null || dataState.getNamesOnAccount() == null) {
            return AcatsInCoOwnerReviewState5.Loading.INSTANCE;
        }
        NamesOnAccount2 coOwnerName = dataState.getNamesOnAccount().getCoOwnerName();
        if (coOwnerName == null || (firstName = coOwnerName.getFirstName()) == null) {
            firstName = "";
        }
        String str = firstName;
        AcatsTransfer acatsTransfer = dataState.getAcatsTransfer();
        UUID id = acatsTransfer.getId();
        String contraDtccNumber = acatsTransfer.getContraDtccNumber();
        String accountNumberRhs = dataState.getAccount().getAccountNumberRhs();
        BrokerageAccountType brokerageAccountType = dataState.getAccount().getBrokerageAccountType();
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C7877R.string.acats_in_review_coowner_title, new Object[0]);
        String contraBrokerName = acatsTransfer.getContraBrokerName();
        if (contraBrokerName == null) {
            contraBrokerName = acatsTransfer.getContraDtccNumber();
        }
        String str2 = contraBrokerName;
        String contraBrokerLogo = acatsTransfer.getContraBrokerLogo();
        String contraAccountNumber = acatsTransfer.getContraAccountNumber();
        StringResource assetsValue = AcatsInCoOwnerReviewState3.getAssetsValue(acatsTransfer);
        StringResource stringResourceNicknameDotFormat = AccountDisplayNames.nicknameDotFormat(dataState.getAccount());
        if (stringResourceNicknameDotFormat == null) {
            stringResourceNicknameDotFormat = AccountDisplayNames.getDisplayName(dataState.getAccount()).getWithInvesting().getTitle();
        }
        StringResource stringResource = stringResourceNicknameDotFormat;
        StringResource stringResourceInvoke2 = companion.invoke(C7686R.string.acats_in_review_names_on_account_many, new Object[0]);
        List<NamesOnAccount2> allNames = dataState.getNamesOnAccount().getAllNames();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(allNames, 10));
        Iterator<T> it = allNames.iterator();
        while (it.hasNext()) {
            arrayList.add(((NamesOnAccount2) it.next()).getFullName());
        }
        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
        StringResource.Companion companion2 = StringResource.INSTANCE;
        return new AcatsInCoOwnerReviewState5.Loaded(id, contraDtccNumber, accountNumberRhs, brokerageAccountType, new ReviewAcatsInViewState(stringResourceInvoke, str2, contraBrokerLogo, contraAccountNumber, assetsValue, stringResource, stringResourceInvoke2, immutableList, null, null, companion2.invoke(C7686R.string.acats_in_review_disclaimer_default, new Object[0]), companion2.invoke(C7877R.string.acats_in_review_coowner_continue_button_text, new Object[0]), companion2.invoke(C7877R.string.acats_in_review_coowner_cancel_button_text, new Object[0])), dataState.isCancelRequestInProgress(), companion2.invoke(C7877R.string.acats_in_review_coowner_cancel_sheet_body, str), str);
    }
}
