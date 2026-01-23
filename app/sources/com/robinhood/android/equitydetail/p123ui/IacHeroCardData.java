package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.educationtour.EducationTourEntryPointData;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/IacHeroCardData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "card", "Lcom/robinhood/models/db/herocard/IacHeroCard;", "instrumentId", "Ljava/util/UUID;", "optionalEducationCardData", "Lcom/robinhood/android/educationtour/EducationTourEntryPointData;", "<init>", "(Lcom/robinhood/models/db/herocard/IacHeroCard;Ljava/util/UUID;Lcom/robinhood/android/educationtour/EducationTourEntryPointData;)V", "getCard", "()Lcom/robinhood/models/db/herocard/IacHeroCard;", "getInstrumentId", "()Ljava/util/UUID;", "getOptionalEducationCardData", "()Lcom/robinhood/android/educationtour/EducationTourEntryPointData;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IacHeroCardData extends DetailData {
    public static final int $stable = 8;
    private final IacHeroCard card;
    private final UUID instrumentId;
    private final EducationTourEntryPointData optionalEducationCardData;

    public static /* synthetic */ IacHeroCardData copy$default(IacHeroCardData iacHeroCardData, IacHeroCard iacHeroCard, UUID uuid, EducationTourEntryPointData educationTourEntryPointData, int i, Object obj) {
        if ((i & 1) != 0) {
            iacHeroCard = iacHeroCardData.card;
        }
        if ((i & 2) != 0) {
            uuid = iacHeroCardData.instrumentId;
        }
        if ((i & 4) != 0) {
            educationTourEntryPointData = iacHeroCardData.optionalEducationCardData;
        }
        return iacHeroCardData.copy(iacHeroCard, uuid, educationTourEntryPointData);
    }

    /* renamed from: component1, reason: from getter */
    public final IacHeroCard getCard() {
        return this.card;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component3, reason: from getter */
    public final EducationTourEntryPointData getOptionalEducationCardData() {
        return this.optionalEducationCardData;
    }

    public final IacHeroCardData copy(IacHeroCard card, UUID instrumentId, EducationTourEntryPointData optionalEducationCardData) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new IacHeroCardData(card, instrumentId, optionalEducationCardData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacHeroCardData)) {
            return false;
        }
        IacHeroCardData iacHeroCardData = (IacHeroCardData) other;
        return Intrinsics.areEqual(this.card, iacHeroCardData.card) && Intrinsics.areEqual(this.instrumentId, iacHeroCardData.instrumentId) && Intrinsics.areEqual(this.optionalEducationCardData, iacHeroCardData.optionalEducationCardData);
    }

    public int hashCode() {
        int iHashCode = ((this.card.hashCode() * 31) + this.instrumentId.hashCode()) * 31;
        EducationTourEntryPointData educationTourEntryPointData = this.optionalEducationCardData;
        return iHashCode + (educationTourEntryPointData == null ? 0 : educationTourEntryPointData.hashCode());
    }

    public String toString() {
        return "IacHeroCardData(card=" + this.card + ", instrumentId=" + this.instrumentId + ", optionalEducationCardData=" + this.optionalEducationCardData + ")";
    }

    public /* synthetic */ IacHeroCardData(IacHeroCard iacHeroCard, UUID uuid, EducationTourEntryPointData educationTourEntryPointData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iacHeroCard, uuid, (i & 4) != 0 ? null : educationTourEntryPointData);
    }

    public final IacHeroCard getCard() {
        return this.card;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final EducationTourEntryPointData getOptionalEducationCardData() {
        return this.optionalEducationCardData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacHeroCardData(IacHeroCard card, UUID instrumentId, EducationTourEntryPointData educationTourEntryPointData) {
        super(null);
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.card = card;
        this.instrumentId = instrumentId;
        this.optionalEducationCardData = educationTourEntryPointData;
    }
}
