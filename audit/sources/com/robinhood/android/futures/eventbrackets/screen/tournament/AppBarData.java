package com.robinhood.android.futures.eventbrackets.screen.tournament;

import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppBarData.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AppBarData;", "", "appBarTitle", "Lcom/robinhood/utils/resource/StringResource;", "realizedPnlValue", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/util/Money;)V", "getAppBarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getRealizedPnlValue", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AppBarData {
    public static final int $stable = 8;
    private final StringResource appBarTitle;
    private final Money realizedPnlValue;

    public static /* synthetic */ AppBarData copy$default(AppBarData appBarData, StringResource stringResource, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = appBarData.appBarTitle;
        }
        if ((i & 2) != 0) {
            money = appBarData.realizedPnlValue;
        }
        return appBarData.copy(stringResource, money);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getAppBarTitle() {
        return this.appBarTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getRealizedPnlValue() {
        return this.realizedPnlValue;
    }

    public final AppBarData copy(StringResource appBarTitle, Money realizedPnlValue) {
        return new AppBarData(appBarTitle, realizedPnlValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppBarData)) {
            return false;
        }
        AppBarData appBarData = (AppBarData) other;
        return Intrinsics.areEqual(this.appBarTitle, appBarData.appBarTitle) && Intrinsics.areEqual(this.realizedPnlValue, appBarData.realizedPnlValue);
    }

    public int hashCode() {
        StringResource stringResource = this.appBarTitle;
        int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
        Money money = this.realizedPnlValue;
        return iHashCode + (money != null ? money.hashCode() : 0);
    }

    public String toString() {
        return "AppBarData(appBarTitle=" + this.appBarTitle + ", realizedPnlValue=" + this.realizedPnlValue + ")";
    }

    public AppBarData(StringResource stringResource, Money money) {
        this.appBarTitle = stringResource;
        this.realizedPnlValue = money;
    }

    public final StringResource getAppBarTitle() {
        return this.appBarTitle;
    }

    public final Money getRealizedPnlValue() {
        return this.realizedPnlValue;
    }
}
