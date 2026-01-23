package com.robinhood.android.acatsin.positionchecklist.alternate.ineligible;

import androidx.compose.p011ui.text.String2;
import androidx.compose.p011ui.text.intl.Locale;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.lib.formats.FormatAsList2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInPositionChecklistIneligibleAlternateViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateViewState;", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "partialContents", "", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;)V", "bodyText", "Lcom/robinhood/utils/resource/StringResource;", "getBodyText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AcatsInPositionChecklistIneligibleAlternateViewState {
    public static final int $stable = 8;
    private final BrokerageAccountType accountType;
    private final StringResource bodyText;
    private final List<String> partialContents;

    /* renamed from: component1, reason: from getter */
    private final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    private final List<String> component2() {
        return this.partialContents;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AcatsInPositionChecklistIneligibleAlternateViewState copy$default(AcatsInPositionChecklistIneligibleAlternateViewState acatsInPositionChecklistIneligibleAlternateViewState, BrokerageAccountType brokerageAccountType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = acatsInPositionChecklistIneligibleAlternateViewState.accountType;
        }
        if ((i & 2) != 0) {
            list = acatsInPositionChecklistIneligibleAlternateViewState.partialContents;
        }
        return acatsInPositionChecklistIneligibleAlternateViewState.copy(brokerageAccountType, list);
    }

    public final AcatsInPositionChecklistIneligibleAlternateViewState copy(BrokerageAccountType accountType, List<String> partialContents) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return new AcatsInPositionChecklistIneligibleAlternateViewState(accountType, partialContents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInPositionChecklistIneligibleAlternateViewState)) {
            return false;
        }
        AcatsInPositionChecklistIneligibleAlternateViewState acatsInPositionChecklistIneligibleAlternateViewState = (AcatsInPositionChecklistIneligibleAlternateViewState) other;
        return this.accountType == acatsInPositionChecklistIneligibleAlternateViewState.accountType && Intrinsics.areEqual(this.partialContents, acatsInPositionChecklistIneligibleAlternateViewState.partialContents);
    }

    public int hashCode() {
        int iHashCode = this.accountType.hashCode() * 31;
        List<String> list = this.partialContents;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "AcatsInPositionChecklistIneligibleAlternateViewState(accountType=" + this.accountType + ", partialContents=" + this.partialContents + ")";
    }

    public AcatsInPositionChecklistIneligibleAlternateViewState(BrokerageAccountType accountType, List<String> list) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.accountType = accountType;
        this.partialContents = list;
        List<String> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C7725R.string.position_checklist_alternate_ineligible_body_partials;
            List<String> list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(String2.toLowerCase((String) it.next(), Locale.INSTANCE.getCurrent()));
            }
            stringResourceInvoke = companion.invoke(i, FormatAsList2.formatAsList(arrayList), StringResource.INSTANCE.invoke(BrokerageAccountTypes2.getDisplayNameInSentenceWithAccountRes(this.accountType), new Object[0]));
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C7725R.string.f3874xd965d83, new Object[0]);
        }
        this.bodyText = stringResourceInvoke;
    }

    public final StringResource getBodyText() {
        return this.bodyText;
    }
}
