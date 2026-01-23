package com.robinhood.android.acatsin.availabledestinations;

import com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.api.bonfire.ApiAvailableAccountOther;
import com.robinhood.models.api.bonfire.ApiAvailableAccountSignup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AcatsInAvailableDestinationsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u0002H\u0002¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDataState;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState;", "<init>", "()V", "reduce", "dataState", "getOptions", "", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInAvailableDestinationsStateProvider implements StateProvider<AcatsInAvailableDestinationsDataState, AcatsInAvailableDestinationsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AcatsInAvailableDestinationsViewState reduce(AcatsInAvailableDestinationsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getError() != null) {
            return AcatsInAvailableDestinationsViewState.Error.INSTANCE;
        }
        if (dataState.getLoaded()) {
            return new AcatsInAvailableDestinationsViewState.Ready(extensions2.toImmutableList(getOptions(dataState)), dataState.getSelectedOption(), dataState.getHeaderContents(), dataState.getStickyFooterContents());
        }
        return AcatsInAvailableDestinationsViewState.Loading.INSTANCE;
    }

    private final List<AcatsDestination> getOptions(AcatsInAvailableDestinationsDataState acatsInAvailableDestinationsDataState) {
        List<AvailableAccount> accountSelections = acatsInAvailableDestinationsDataState.getAccountSelections();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accountSelections, 10));
        Iterator<T> it = accountSelections.iterator();
        while (it.hasNext()) {
            arrayList.add(AcatsDestination2.toUiModel((AvailableAccount) it.next(), acatsInAvailableDestinationsDataState.getSelectedOption()));
        }
        if (acatsInAvailableDestinationsDataState.isAcatsRetry()) {
            return arrayList;
        }
        List<ApiAvailableAccountSignup> signupSelections = acatsInAvailableDestinationsDataState.getSignupSelections();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(signupSelections, 10));
        Iterator<T> it2 = signupSelections.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AcatsDestination2.toUiModel((ApiAvailableAccountSignup) it2.next(), acatsInAvailableDestinationsDataState.getSelectedOption()));
        }
        List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
        List<ApiAvailableAccountOther> otherSelections = acatsInAvailableDestinationsDataState.getOtherSelections();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(otherSelections, 10));
        Iterator<T> it3 = otherSelections.iterator();
        while (it3.hasNext()) {
            arrayList3.add(AcatsDestination2.toUiModel((ApiAvailableAccountOther) it3.next(), acatsInAvailableDestinationsDataState.getSelectedOption()));
        }
        return CollectionsKt.plus((Collection) listPlus, (Iterable) arrayList3);
    }
}
