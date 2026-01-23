package com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ResurrectionLoggingModel.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J<\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;", "", "upsellIdentifier", "", "shouldShow", "", "shownCount", "", "msSinceLastShown", "", "<init>", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Long;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLjava/lang/Integer;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUpsellIdentifier", "()Ljava/lang/String;", "getShouldShow", "()Z", "getShownCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMsSinceLastShown", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Long;)Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes22.dex */
public final /* data */ class ResurrectionUpsellModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Long msSinceLastShown;
    private final boolean shouldShow;
    private final Integer shownCount;
    private final String upsellIdentifier;

    public static /* synthetic */ ResurrectionUpsellModel copy$default(ResurrectionUpsellModel resurrectionUpsellModel, String str, boolean z, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resurrectionUpsellModel.upsellIdentifier;
        }
        if ((i & 2) != 0) {
            z = resurrectionUpsellModel.shouldShow;
        }
        if ((i & 4) != 0) {
            num = resurrectionUpsellModel.shownCount;
        }
        if ((i & 8) != 0) {
            l = resurrectionUpsellModel.msSinceLastShown;
        }
        return resurrectionUpsellModel.copy(str, z, num, l);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUpsellIdentifier() {
        return this.upsellIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getShownCount() {
        return this.shownCount;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getMsSinceLastShown() {
        return this.msSinceLastShown;
    }

    public final ResurrectionUpsellModel copy(String upsellIdentifier, boolean shouldShow, Integer shownCount, Long msSinceLastShown) {
        return new ResurrectionUpsellModel(upsellIdentifier, shouldShow, shownCount, msSinceLastShown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResurrectionUpsellModel)) {
            return false;
        }
        ResurrectionUpsellModel resurrectionUpsellModel = (ResurrectionUpsellModel) other;
        return Intrinsics.areEqual(this.upsellIdentifier, resurrectionUpsellModel.upsellIdentifier) && this.shouldShow == resurrectionUpsellModel.shouldShow && Intrinsics.areEqual(this.shownCount, resurrectionUpsellModel.shownCount) && Intrinsics.areEqual(this.msSinceLastShown, resurrectionUpsellModel.msSinceLastShown);
    }

    public int hashCode() {
        String str = this.upsellIdentifier;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.shouldShow)) * 31;
        Integer num = this.shownCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.msSinceLastShown;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "ResurrectionUpsellModel(upsellIdentifier=" + this.upsellIdentifier + ", shouldShow=" + this.shouldShow + ", shownCount=" + this.shownCount + ", msSinceLastShown=" + this.msSinceLastShown + ")";
    }

    /* compiled from: ResurrectionLoggingModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResurrectionUpsellModel> serializer() {
            return ResurrectionLoggingModel4.INSTANCE;
        }
    }

    public /* synthetic */ ResurrectionUpsellModel(int i, String str, boolean z, Integer num, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, ResurrectionLoggingModel4.INSTANCE.getDescriptor());
        }
        this.upsellIdentifier = str;
        this.shouldShow = z;
        this.shownCount = num;
        this.msSinceLastShown = l;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(ResurrectionUpsellModel self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.upsellIdentifier);
        output.encodeBooleanElement(serialDesc, 1, self.shouldShow);
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.shownCount);
        output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.msSinceLastShown);
    }

    public ResurrectionUpsellModel(String str, boolean z, Integer num, Long l) {
        this.upsellIdentifier = str;
        this.shouldShow = z;
        this.shownCount = num;
        this.msSinceLastShown = l;
    }

    public final String getUpsellIdentifier() {
        return this.upsellIdentifier;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final Integer getShownCount() {
        return this.shownCount;
    }

    public final Long getMsSinceLastShown() {
        return this.msSinceLastShown;
    }
}
