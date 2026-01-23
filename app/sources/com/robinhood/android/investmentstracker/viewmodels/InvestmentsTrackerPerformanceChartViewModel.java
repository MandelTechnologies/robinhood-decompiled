package com.robinhood.android.investmentstracker.viewmodels;

import bff_money_movement.service.p019v1.InvestmentsTrackerComponentPerformanceChartDetailsDto;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: InvestmentsTrackerPerformanceChartViewModel.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010&\u001a\u00020\u0000H\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003Jy\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00102\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0014\u0010\u000f\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerPerformanceChartViewModel;", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "type", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", ErrorBundle.DETAIL_ENTRY, "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;", "activeSpan", "Lcom/robinhood/android/charts/models/db/SpanOption;", "spans", "Lkotlinx/collections/immutable/ImmutableList;", "subtitleOverrideDisplayText", "", "usePositiveSpanTheme", "", "canShowGradient", "id", "animateFirstTimeShow", "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "<init>", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;Lcom/robinhood/android/charts/models/db/SpanOption;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;ZZLjava/lang/String;ZLcom/robinhood/android/investmentstracker/security/SecurityFilter;)V", "getType", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "getDetails", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;", "getActiveSpan", "()Lcom/robinhood/android/charts/models/db/SpanOption;", "getSpans", "()Lkotlinx/collections/immutable/ImmutableList;", "getSubtitleOverrideDisplayText", "()Ljava/lang/String;", "getUsePositiveSpanTheme", "()Z", "getCanShowGradient", "getId", "getAnimateFirstTimeShow", "getSecurityFilter", "()Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "copyForView", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerPerformanceChartViewModel implements InvestmentsTrackerComponent {
    public static final int $stable = 8;
    private final SpanOption activeSpan;
    private final boolean animateFirstTimeShow;
    private final boolean canShowGradient;
    private final InvestmentsTrackerComponentPerformanceChartDetailsDto details;
    private final String id;
    private final SecurityFilter securityFilter;
    private final ImmutableList<SpanOption> spans;
    private final String subtitleOverrideDisplayText;
    private final InvestmentsTrackerComponentType type;
    private final boolean usePositiveSpanTheme;

    public static /* synthetic */ InvestmentsTrackerPerformanceChartViewModel copy$default(InvestmentsTrackerPerformanceChartViewModel investmentsTrackerPerformanceChartViewModel, InvestmentsTrackerComponentType investmentsTrackerComponentType, InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDto, SpanOption spanOption, ImmutableList immutableList, String str, boolean z, boolean z2, String str2, boolean z3, SecurityFilter securityFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerComponentType = investmentsTrackerPerformanceChartViewModel.type;
        }
        if ((i & 2) != 0) {
            investmentsTrackerComponentPerformanceChartDetailsDto = investmentsTrackerPerformanceChartViewModel.details;
        }
        if ((i & 4) != 0) {
            spanOption = investmentsTrackerPerformanceChartViewModel.activeSpan;
        }
        if ((i & 8) != 0) {
            immutableList = investmentsTrackerPerformanceChartViewModel.spans;
        }
        if ((i & 16) != 0) {
            str = investmentsTrackerPerformanceChartViewModel.subtitleOverrideDisplayText;
        }
        if ((i & 32) != 0) {
            z = investmentsTrackerPerformanceChartViewModel.usePositiveSpanTheme;
        }
        if ((i & 64) != 0) {
            z2 = investmentsTrackerPerformanceChartViewModel.canShowGradient;
        }
        if ((i & 128) != 0) {
            str2 = investmentsTrackerPerformanceChartViewModel.id;
        }
        if ((i & 256) != 0) {
            z3 = investmentsTrackerPerformanceChartViewModel.animateFirstTimeShow;
        }
        if ((i & 512) != 0) {
            securityFilter = investmentsTrackerPerformanceChartViewModel.securityFilter;
        }
        boolean z4 = z3;
        SecurityFilter securityFilter2 = securityFilter;
        boolean z5 = z2;
        String str3 = str2;
        String str4 = str;
        boolean z6 = z;
        return investmentsTrackerPerformanceChartViewModel.copy(investmentsTrackerComponentType, investmentsTrackerComponentPerformanceChartDetailsDto, spanOption, immutableList, str4, z6, z5, str3, z4, securityFilter2);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    /* renamed from: component2, reason: from getter */
    public final InvestmentsTrackerComponentPerformanceChartDetailsDto getDetails() {
        return this.details;
    }

    /* renamed from: component3, reason: from getter */
    public final SpanOption getActiveSpan() {
        return this.activeSpan;
    }

    public final ImmutableList<SpanOption> component4() {
        return this.spans;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubtitleOverrideDisplayText() {
        return this.subtitleOverrideDisplayText;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUsePositiveSpanTheme() {
        return this.usePositiveSpanTheme;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getCanShowGradient() {
        return this.canShowGradient;
    }

    /* renamed from: component8, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getAnimateFirstTimeShow() {
        return this.animateFirstTimeShow;
    }

    public final InvestmentsTrackerPerformanceChartViewModel copy(InvestmentsTrackerComponentType type2, InvestmentsTrackerComponentPerformanceChartDetailsDto details, SpanOption activeSpan, ImmutableList<SpanOption> spans, String subtitleOverrideDisplayText, boolean usePositiveSpanTheme, boolean canShowGradient, String id, boolean animateFirstTimeShow, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        return new InvestmentsTrackerPerformanceChartViewModel(type2, details, activeSpan, spans, subtitleOverrideDisplayText, usePositiveSpanTheme, canShowGradient, id, animateFirstTimeShow, securityFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerPerformanceChartViewModel)) {
            return false;
        }
        InvestmentsTrackerPerformanceChartViewModel investmentsTrackerPerformanceChartViewModel = (InvestmentsTrackerPerformanceChartViewModel) other;
        return this.type == investmentsTrackerPerformanceChartViewModel.type && Intrinsics.areEqual(this.details, investmentsTrackerPerformanceChartViewModel.details) && Intrinsics.areEqual(this.activeSpan, investmentsTrackerPerformanceChartViewModel.activeSpan) && Intrinsics.areEqual(this.spans, investmentsTrackerPerformanceChartViewModel.spans) && Intrinsics.areEqual(this.subtitleOverrideDisplayText, investmentsTrackerPerformanceChartViewModel.subtitleOverrideDisplayText) && this.usePositiveSpanTheme == investmentsTrackerPerformanceChartViewModel.usePositiveSpanTheme && this.canShowGradient == investmentsTrackerPerformanceChartViewModel.canShowGradient && Intrinsics.areEqual(this.id, investmentsTrackerPerformanceChartViewModel.id) && this.animateFirstTimeShow == investmentsTrackerPerformanceChartViewModel.animateFirstTimeShow && Intrinsics.areEqual(this.securityFilter, investmentsTrackerPerformanceChartViewModel.securityFilter);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDto = this.details;
        int iHashCode2 = (iHashCode + (investmentsTrackerComponentPerformanceChartDetailsDto == null ? 0 : investmentsTrackerComponentPerformanceChartDetailsDto.hashCode())) * 31;
        SpanOption spanOption = this.activeSpan;
        int iHashCode3 = (((iHashCode2 + (spanOption == null ? 0 : spanOption.hashCode())) * 31) + this.spans.hashCode()) * 31;
        String str = this.subtitleOverrideDisplayText;
        return ((((((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.usePositiveSpanTheme)) * 31) + Boolean.hashCode(this.canShowGradient)) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.animateFirstTimeShow)) * 31) + this.securityFilter.hashCode();
    }

    public String toString() {
        return "InvestmentsTrackerPerformanceChartViewModel(type=" + this.type + ", details=" + this.details + ", activeSpan=" + this.activeSpan + ", spans=" + this.spans + ", subtitleOverrideDisplayText=" + this.subtitleOverrideDisplayText + ", usePositiveSpanTheme=" + this.usePositiveSpanTheme + ", canShowGradient=" + this.canShowGradient + ", id=" + this.id + ", animateFirstTimeShow=" + this.animateFirstTimeShow + ", securityFilter=" + this.securityFilter + ")";
    }

    public InvestmentsTrackerPerformanceChartViewModel(InvestmentsTrackerComponentType type2, InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDto, SpanOption spanOption, ImmutableList<SpanOption> spans, String str, boolean z, boolean z2, String id, boolean z3, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        this.type = type2;
        this.details = investmentsTrackerComponentPerformanceChartDetailsDto;
        this.activeSpan = spanOption;
        this.spans = spans;
        this.subtitleOverrideDisplayText = str;
        this.usePositiveSpanTheme = z;
        this.canShowGradient = z2;
        this.id = id;
        this.animateFirstTimeShow = z3;
        this.securityFilter = securityFilter;
    }

    public /* synthetic */ InvestmentsTrackerPerformanceChartViewModel(InvestmentsTrackerComponentType investmentsTrackerComponentType, InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDto, SpanOption spanOption, ImmutableList immutableList, String str, boolean z, boolean z2, String str2, boolean z3, SecurityFilter securityFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(investmentsTrackerComponentType, investmentsTrackerComponentPerformanceChartDetailsDto, spanOption, immutableList, str, z, z2, str2, (i & 256) != 0 ? false : z3, securityFilter);
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    public final InvestmentsTrackerComponentPerformanceChartDetailsDto getDetails() {
        return this.details;
    }

    public final SpanOption getActiveSpan() {
        return this.activeSpan;
    }

    public final ImmutableList<SpanOption> getSpans() {
        return this.spans;
    }

    public final String getSubtitleOverrideDisplayText() {
        return this.subtitleOverrideDisplayText;
    }

    public final boolean getUsePositiveSpanTheme() {
        return this.usePositiveSpanTheme;
    }

    public final boolean getCanShowGradient() {
        return this.canShowGradient;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public String getId() {
        return this.id;
    }

    public final boolean getAnimateFirstTimeShow() {
        return this.animateFirstTimeShow;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerPerformanceChartViewModel copyForView() {
        return copy$default(this, null, null, null, null, null, false, false, null, false, null, 1023, null);
    }
}
