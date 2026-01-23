package com.robinhood.android.retirement.dashboard.contribution;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContributionsSummaryCard.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Top", "Middle", "Bottom", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryRingPlacement, reason: use source file name */
/* loaded from: classes5.dex */
public final class ContributionsSummaryCard implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContributionsSummaryCard[] $VALUES;
    public static final Parcelable.Creator<ContributionsSummaryCard> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ContributionsSummaryCard Top = new ContributionsSummaryCard("Top", 0);
    public static final ContributionsSummaryCard Middle = new ContributionsSummaryCard("Middle", 1);
    public static final ContributionsSummaryCard Bottom = new ContributionsSummaryCard("Bottom", 2);

    private static final /* synthetic */ ContributionsSummaryCard[] $values() {
        return new ContributionsSummaryCard[]{Top, Middle, Bottom};
    }

    public static EnumEntries<ContributionsSummaryCard> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private ContributionsSummaryCard(String str, int i) {
    }

    static {
        ContributionsSummaryCard[] contributionsSummaryCardArr$values = $values();
        $VALUES = contributionsSummaryCardArr$values;
        $ENTRIES = EnumEntries2.enumEntries(contributionsSummaryCardArr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<ContributionsSummaryCard>() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryRingPlacement.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ContributionsSummaryCard createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ContributionsSummaryCard.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ContributionsSummaryCard[] newArray(int i) {
                return new ContributionsSummaryCard[i];
            }
        };
    }

    /* compiled from: ContributionsSummaryCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement$Companion;", "", "<init>", "()V", "fromString", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;", "value", "", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryRingPlacement$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContributionsSummaryCard fromString(String value) {
            String lowerCase;
            if (value != null) {
                lowerCase = value.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            return Intrinsics.areEqual(lowerCase, "middle") ? ContributionsSummaryCard.Middle : Intrinsics.areEqual(lowerCase, "bottom") ? ContributionsSummaryCard.Bottom : ContributionsSummaryCard.Top;
        }
    }

    public static ContributionsSummaryCard valueOf(String str) {
        return (ContributionsSummaryCard) Enum.valueOf(ContributionsSummaryCard.class, str);
    }

    public static ContributionsSummaryCard[] values() {
        return (ContributionsSummaryCard[]) $VALUES.clone();
    }
}
