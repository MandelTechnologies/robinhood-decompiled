package com.robinhood.onboarding.goldearningspotential.contracts;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.sdui.SduiText;
import microgram.p507ui.sdui.SduiText$$serializer;

/* compiled from: GoldEarningsModel.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorViewModel;", "", "seen1", "", "title", "Lmicrogram/ui/sdui/SduiText;", "subtitle", "remoteImageUrl", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILmicrogram/ui/sdui/SduiText;Lmicrogram/ui/sdui/SduiText;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lmicrogram/ui/sdui/SduiText;Lmicrogram/ui/sdui/SduiText;Ljava/lang/String;)V", "getRemoteImageUrl", "()Ljava/lang/String;", "getSubtitle", "()Lmicrogram/ui/sdui/SduiText;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes22.dex */
public final /* data */ class GoldEarningsCalculatorViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String remoteImageUrl;
    private final SduiText subtitle;
    private final SduiText title;

    public static /* synthetic */ GoldEarningsCalculatorViewModel copy$default(GoldEarningsCalculatorViewModel goldEarningsCalculatorViewModel, SduiText sduiText, SduiText sduiText2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            sduiText = goldEarningsCalculatorViewModel.title;
        }
        if ((i & 2) != 0) {
            sduiText2 = goldEarningsCalculatorViewModel.subtitle;
        }
        if ((i & 4) != 0) {
            str = goldEarningsCalculatorViewModel.remoteImageUrl;
        }
        return goldEarningsCalculatorViewModel.copy(sduiText, sduiText2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final SduiText getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final SduiText getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRemoteImageUrl() {
        return this.remoteImageUrl;
    }

    public final GoldEarningsCalculatorViewModel copy(SduiText title, SduiText subtitle, String remoteImageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new GoldEarningsCalculatorViewModel(title, subtitle, remoteImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldEarningsCalculatorViewModel)) {
            return false;
        }
        GoldEarningsCalculatorViewModel goldEarningsCalculatorViewModel = (GoldEarningsCalculatorViewModel) other;
        return Intrinsics.areEqual(this.title, goldEarningsCalculatorViewModel.title) && Intrinsics.areEqual(this.subtitle, goldEarningsCalculatorViewModel.subtitle) && Intrinsics.areEqual(this.remoteImageUrl, goldEarningsCalculatorViewModel.remoteImageUrl);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31;
        String str = this.remoteImageUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GoldEarningsCalculatorViewModel(title=" + this.title + ", subtitle=" + this.subtitle + ", remoteImageUrl=" + this.remoteImageUrl + ")";
    }

    /* compiled from: GoldEarningsModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorViewModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorViewModel;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GoldEarningsCalculatorViewModel> serializer() {
            return GoldEarningsCalculatorViewModel$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ GoldEarningsCalculatorViewModel(int i, SduiText sduiText, SduiText sduiText2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, GoldEarningsCalculatorViewModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = sduiText;
        this.subtitle = sduiText2;
        if ((i & 4) == 0) {
            this.remoteImageUrl = null;
        } else {
            this.remoteImageUrl = str;
        }
    }

    public GoldEarningsCalculatorViewModel(SduiText title, SduiText subtitle, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.remoteImageUrl = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(GoldEarningsCalculatorViewModel self, Encoding3 output, SerialDescriptor serialDesc) {
        SduiText$$serializer sduiText$$serializer = SduiText$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, sduiText$$serializer, self.title);
        output.encodeSerializableElement(serialDesc, 1, sduiText$$serializer, self.subtitle);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.remoteImageUrl == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.remoteImageUrl);
    }

    public /* synthetic */ GoldEarningsCalculatorViewModel(SduiText sduiText, SduiText sduiText2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sduiText, sduiText2, (i & 4) != 0 ? null : str);
    }

    public final SduiText getTitle() {
        return this.title;
    }

    public final SduiText getSubtitle() {
        return this.subtitle;
    }

    public final String getRemoteImageUrl() {
        return this.remoteImageUrl;
    }
}
