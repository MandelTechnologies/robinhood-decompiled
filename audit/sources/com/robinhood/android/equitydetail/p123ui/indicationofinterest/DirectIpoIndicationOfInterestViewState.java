package com.robinhood.android.equitydetail.p123ui.indicationofinterest;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.directipo.models.p292db.DirectIpoIndicationOfInterest;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoIndicationOfInterestViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000267By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÂ\u0003J{\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState;", "", "reviewed", "", "contentLoaded", "title", "", "subtitleMarkdown", "footerMarkdown", "dismissButtonTitle", "rows", "", "Lcom/robinhood/directipo/models/db/DirectIpoIndicationOfInterest$Row;", "expressInterestEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$ExpressInterestResult;", "acceptButtonTitle", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;)V", "getReviewed", "()Z", "getContentLoaded", "getTitle", "()Ljava/lang/String;", "getSubtitleMarkdown", "getFooterMarkdown", "getDismissButtonTitle", "getRows", "()Ljava/util/List;", "getExpressInterestEvent", "()Lcom/robinhood/udf/UiEvent;", "acceptButtonAction", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$AcceptButtonAction;", "getAcceptButtonAction", "()Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$AcceptButtonAction;", "getAcceptButtonTitle", "", "resources", "Landroid/content/res/Resources;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "AcceptButtonAction", "ExpressInterestResult", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DirectIpoIndicationOfInterestViewState {
    public static final int $stable = 8;
    private final String acceptButtonTitle;
    private final boolean contentLoaded;
    private final String dismissButtonTitle;
    private final UiEvent<ExpressInterestResult> expressInterestEvent;
    private final String footerMarkdown;
    private final boolean reviewed;
    private final List<DirectIpoIndicationOfInterest.Row> rows;
    private final String subtitleMarkdown;
    private final String title;

    public DirectIpoIndicationOfInterestViewState() {
        this(false, false, null, null, null, null, null, null, null, 511, null);
    }

    /* renamed from: component9, reason: from getter */
    private final String getAcceptButtonTitle() {
        return this.acceptButtonTitle;
    }

    public static /* synthetic */ DirectIpoIndicationOfInterestViewState copy$default(DirectIpoIndicationOfInterestViewState directIpoIndicationOfInterestViewState, boolean z, boolean z2, String str, String str2, String str3, String str4, List list, UiEvent uiEvent, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = directIpoIndicationOfInterestViewState.reviewed;
        }
        if ((i & 2) != 0) {
            z2 = directIpoIndicationOfInterestViewState.contentLoaded;
        }
        if ((i & 4) != 0) {
            str = directIpoIndicationOfInterestViewState.title;
        }
        if ((i & 8) != 0) {
            str2 = directIpoIndicationOfInterestViewState.subtitleMarkdown;
        }
        if ((i & 16) != 0) {
            str3 = directIpoIndicationOfInterestViewState.footerMarkdown;
        }
        if ((i & 32) != 0) {
            str4 = directIpoIndicationOfInterestViewState.dismissButtonTitle;
        }
        if ((i & 64) != 0) {
            list = directIpoIndicationOfInterestViewState.rows;
        }
        if ((i & 128) != 0) {
            uiEvent = directIpoIndicationOfInterestViewState.expressInterestEvent;
        }
        if ((i & 256) != 0) {
            str5 = directIpoIndicationOfInterestViewState.acceptButtonTitle;
        }
        UiEvent uiEvent2 = uiEvent;
        String str6 = str5;
        String str7 = str4;
        List list2 = list;
        String str8 = str3;
        String str9 = str;
        return directIpoIndicationOfInterestViewState.copy(z, z2, str9, str2, str8, str7, list2, uiEvent2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getReviewed() {
        return this.reviewed;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getContentLoaded() {
        return this.contentLoaded;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFooterMarkdown() {
        return this.footerMarkdown;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDismissButtonTitle() {
        return this.dismissButtonTitle;
    }

    public final List<DirectIpoIndicationOfInterest.Row> component7() {
        return this.rows;
    }

    public final UiEvent<ExpressInterestResult> component8() {
        return this.expressInterestEvent;
    }

    public final DirectIpoIndicationOfInterestViewState copy(boolean reviewed, boolean contentLoaded, String title, String subtitleMarkdown, String footerMarkdown, String dismissButtonTitle, List<DirectIpoIndicationOfInterest.Row> rows, UiEvent<ExpressInterestResult> expressInterestEvent, String acceptButtonTitle) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new DirectIpoIndicationOfInterestViewState(reviewed, contentLoaded, title, subtitleMarkdown, footerMarkdown, dismissButtonTitle, rows, expressInterestEvent, acceptButtonTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectIpoIndicationOfInterestViewState)) {
            return false;
        }
        DirectIpoIndicationOfInterestViewState directIpoIndicationOfInterestViewState = (DirectIpoIndicationOfInterestViewState) other;
        return this.reviewed == directIpoIndicationOfInterestViewState.reviewed && this.contentLoaded == directIpoIndicationOfInterestViewState.contentLoaded && Intrinsics.areEqual(this.title, directIpoIndicationOfInterestViewState.title) && Intrinsics.areEqual(this.subtitleMarkdown, directIpoIndicationOfInterestViewState.subtitleMarkdown) && Intrinsics.areEqual(this.footerMarkdown, directIpoIndicationOfInterestViewState.footerMarkdown) && Intrinsics.areEqual(this.dismissButtonTitle, directIpoIndicationOfInterestViewState.dismissButtonTitle) && Intrinsics.areEqual(this.rows, directIpoIndicationOfInterestViewState.rows) && Intrinsics.areEqual(this.expressInterestEvent, directIpoIndicationOfInterestViewState.expressInterestEvent) && Intrinsics.areEqual(this.acceptButtonTitle, directIpoIndicationOfInterestViewState.acceptButtonTitle);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.reviewed) * 31) + Boolean.hashCode(this.contentLoaded)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitleMarkdown;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.footerMarkdown;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dismissButtonTitle;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.rows.hashCode()) * 31;
        UiEvent<ExpressInterestResult> uiEvent = this.expressInterestEvent;
        int iHashCode6 = (iHashCode5 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        String str5 = this.acceptButtonTitle;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "DirectIpoIndicationOfInterestViewState(reviewed=" + this.reviewed + ", contentLoaded=" + this.contentLoaded + ", title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", footerMarkdown=" + this.footerMarkdown + ", dismissButtonTitle=" + this.dismissButtonTitle + ", rows=" + this.rows + ", expressInterestEvent=" + this.expressInterestEvent + ", acceptButtonTitle=" + this.acceptButtonTitle + ")";
    }

    public DirectIpoIndicationOfInterestViewState(boolean z, boolean z2, String str, String str2, String str3, String str4, List<DirectIpoIndicationOfInterest.Row> rows, UiEvent<ExpressInterestResult> uiEvent, String str5) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.reviewed = z;
        this.contentLoaded = z2;
        this.title = str;
        this.subtitleMarkdown = str2;
        this.footerMarkdown = str3;
        this.dismissButtonTitle = str4;
        this.rows = rows;
        this.expressInterestEvent = uiEvent;
        this.acceptButtonTitle = str5;
    }

    public final boolean getReviewed() {
        return this.reviewed;
    }

    public final boolean getContentLoaded() {
        return this.contentLoaded;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final String getFooterMarkdown() {
        return this.footerMarkdown;
    }

    public final String getDismissButtonTitle() {
        return this.dismissButtonTitle;
    }

    public /* synthetic */ DirectIpoIndicationOfInterestViewState(boolean z, boolean z2, String str, String str2, String str3, String str4, List list, UiEvent uiEvent, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : uiEvent, (i & 256) != 0 ? null : str5);
    }

    public final List<DirectIpoIndicationOfInterest.Row> getRows() {
        return this.rows;
    }

    public final UiEvent<ExpressInterestResult> getExpressInterestEvent() {
        return this.expressInterestEvent;
    }

    public final AcceptButtonAction getAcceptButtonAction() {
        if (this.reviewed) {
            return AcceptButtonAction.ACCEPT;
        }
        return AcceptButtonAction.REVIEW;
    }

    public final CharSequence getAcceptButtonTitle(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String str = this.acceptButtonTitle;
        if (str == null) {
            return null;
        }
        return this.reviewed ? str : resources.getString(C11048R.string.general_action_review);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectIpoIndicationOfInterestViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$AcceptButtonAction;", "", "<init>", "(Ljava/lang/String;I)V", "REVIEW", "ACCEPT", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AcceptButtonAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AcceptButtonAction[] $VALUES;
        public static final AcceptButtonAction REVIEW = new AcceptButtonAction("REVIEW", 0);
        public static final AcceptButtonAction ACCEPT = new AcceptButtonAction("ACCEPT", 1);

        private static final /* synthetic */ AcceptButtonAction[] $values() {
            return new AcceptButtonAction[]{REVIEW, ACCEPT};
        }

        public static EnumEntries<AcceptButtonAction> getEntries() {
            return $ENTRIES;
        }

        private AcceptButtonAction(String str, int i) {
        }

        static {
            AcceptButtonAction[] acceptButtonActionArr$values = $values();
            $VALUES = acceptButtonActionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(acceptButtonActionArr$values);
        }

        public static AcceptButtonAction valueOf(String str) {
            return (AcceptButtonAction) Enum.valueOf(AcceptButtonAction.class, str);
        }

        public static AcceptButtonAction[] values() {
            return (AcceptButtonAction[]) $VALUES.clone();
        }
    }

    /* compiled from: DirectIpoIndicationOfInterestViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$ExpressInterestResult;", "", "<init>", "()V", "Loading", "Success", "Failure", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$ExpressInterestResult$Failure;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$ExpressInterestResult$Loading;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$ExpressInterestResult$Success;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ExpressInterestResult {
        public static final int $stable = 0;

        public /* synthetic */ ExpressInterestResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DirectIpoIndicationOfInterestViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$ExpressInterestResult$Loading;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$ExpressInterestResult;", "<init>", "()V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends ExpressInterestResult {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private ExpressInterestResult() {
        }

        /* compiled from: DirectIpoIndicationOfInterestViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$ExpressInterestResult$Success;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$ExpressInterestResult;", "alert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "<init>", "(Lcom/robinhood/models/serverdriven/db/GenericAlert;)V", "getAlert", "()Lcom/robinhood/models/serverdriven/db/GenericAlert;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Success extends ExpressInterestResult {
            public static final int $stable = 8;
            private final GenericAlert alert;

            public Success(GenericAlert genericAlert) {
                super(null);
                this.alert = genericAlert;
            }

            public final GenericAlert getAlert() {
                return this.alert;
            }
        }

        /* compiled from: DirectIpoIndicationOfInterestViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$ExpressInterestResult$Failure;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState$ExpressInterestResult;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Failure extends ExpressInterestResult {
            public static final int $stable = 8;
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }
}
