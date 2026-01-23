package com.truelayer.payments.core.network.experience.entity.response;

import android.graphics.Color;
import com.robinhood.android.car.result.CarResultComposable2;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.TrueLayerCore;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.net.URI;
import java.net.URL;
import kotlin.Deprecated;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: MerchantConfigResponse.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002WXB¯\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\f\u0012\b\b\u0001\u0010\u0014\u001a\u00020\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017B\u0085\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0002\u0010\u0018J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003J\t\u0010D\u001a\u00020\fHÆ\u0003J\t\u0010E\u001a\u00020\fHÆ\u0003J\u009d\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\fHÆ\u0001J\u0013\u0010G\u001a\u00020\f2\b\u0010H\u001a\u0004\u0018\u00010IHÖ\u0003J\t\u0010J\u001a\u00020\u0004HÖ\u0001J\b\u0010K\u001a\u00020\u0002H\u0016J\t\u0010L\u001a\u00020\u0006HÖ\u0001J\n\u0010M\u001a\u0004\u0018\u00010NH\u0002J&\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UHÁ\u0001¢\u0006\u0002\bVR\u001c\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001c\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001c\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u001c\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010+R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010+R\u001c\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001cR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010+R\u001c\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\u001cR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u0010+¨\u0006Y"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/MerchantConfigResponse;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "seen1", "", "name", "", "logoUri", "primaryColor", "secondaryColor", "tertiaryColor", "colors", "", "fonts", CarResultComposable2.BUTTONS, "inputs", "listOption", "spinner", "illustration", "branding", "regulated", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZ)V", "getBranding$annotations", "()V", "getBranding", "()Z", "getButtons$annotations", "getButtons", "getColors$annotations", "getColors", "getFonts$annotations", "getFonts", "getIllustration$annotations", "getIllustration", "getInputs$annotations", "getInputs", "getListOption$annotations", "getListOption", "getLogoUri$annotations", "getLogoUri", "()Ljava/lang/String;", "getName$annotations", "getName", "getPrimaryColor$annotations", "getPrimaryColor", "getRegulated$annotations", "getRegulated", "getSecondaryColor$annotations", "getSecondaryColor", "getSpinner$annotations", "getSpinner", "getTertiaryColor$annotations", "getTertiaryColor", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "intoDomain", "toString", "tryLogoUrlParse", "Ljava/net/URL;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class MerchantConfigResponse implements IntoDomain<MerchantConfig> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean branding;
    private final boolean buttons;
    private final boolean colors;
    private final boolean fonts;
    private final boolean illustration;
    private final boolean inputs;
    private final boolean listOption;
    private final String logoUri;
    private final String name;
    private final String primaryColor;
    private final boolean regulated;
    private final String secondaryColor;
    private final boolean spinner;
    private final String tertiaryColor;

    @SerialName("branding")
    public static /* synthetic */ void getBranding$annotations() {
    }

    @SerialName(CarResultComposable2.BUTTONS)
    public static /* synthetic */ void getButtons$annotations() {
    }

    @SerialName("colors")
    public static /* synthetic */ void getColors$annotations() {
    }

    @SerialName("fonts")
    public static /* synthetic */ void getFonts$annotations() {
    }

    @SerialName("illustration")
    public static /* synthetic */ void getIllustration$annotations() {
    }

    @SerialName("inputs")
    public static /* synthetic */ void getInputs$annotations() {
    }

    @SerialName("list_option")
    public static /* synthetic */ void getListOption$annotations() {
    }

    @SerialName("logo_uri")
    public static /* synthetic */ void getLogoUri$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("primary_color")
    public static /* synthetic */ void getPrimaryColor$annotations() {
    }

    @SerialName("regulated")
    public static /* synthetic */ void getRegulated$annotations() {
    }

    @SerialName("secondary_color")
    public static /* synthetic */ void getSecondaryColor$annotations() {
    }

    @SerialName("spinner")
    public static /* synthetic */ void getSpinner$annotations() {
    }

    @SerialName("tertiary_color")
    public static /* synthetic */ void getTertiaryColor$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getListOption() {
        return this.listOption;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getSpinner() {
        return this.spinner;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIllustration() {
        return this.illustration;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getBranding() {
        return this.branding;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getRegulated() {
        return this.regulated;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogoUri() {
        return this.logoUri;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSecondaryColor() {
        return this.secondaryColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTertiaryColor() {
        return this.tertiaryColor;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getColors() {
        return this.colors;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getFonts() {
        return this.fonts;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getButtons() {
        return this.buttons;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getInputs() {
        return this.inputs;
    }

    public final MerchantConfigResponse copy(String name, String logoUri, String primaryColor, String secondaryColor, String tertiaryColor, boolean colors, boolean fonts, boolean buttons, boolean inputs, boolean listOption, boolean spinner, boolean illustration, boolean branding, boolean regulated) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new MerchantConfigResponse(name, logoUri, primaryColor, secondaryColor, tertiaryColor, colors, fonts, buttons, inputs, listOption, spinner, illustration, branding, regulated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantConfigResponse)) {
            return false;
        }
        MerchantConfigResponse merchantConfigResponse = (MerchantConfigResponse) other;
        return Intrinsics.areEqual(this.name, merchantConfigResponse.name) && Intrinsics.areEqual(this.logoUri, merchantConfigResponse.logoUri) && Intrinsics.areEqual(this.primaryColor, merchantConfigResponse.primaryColor) && Intrinsics.areEqual(this.secondaryColor, merchantConfigResponse.secondaryColor) && Intrinsics.areEqual(this.tertiaryColor, merchantConfigResponse.tertiaryColor) && this.colors == merchantConfigResponse.colors && this.fonts == merchantConfigResponse.fonts && this.buttons == merchantConfigResponse.buttons && this.inputs == merchantConfigResponse.inputs && this.listOption == merchantConfigResponse.listOption && this.spinner == merchantConfigResponse.spinner && this.illustration == merchantConfigResponse.illustration && this.branding == merchantConfigResponse.branding && this.regulated == merchantConfigResponse.regulated;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.logoUri;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.primaryColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryColor;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tertiaryColor;
        return ((((((((((((((((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.colors)) * 31) + Boolean.hashCode(this.fonts)) * 31) + Boolean.hashCode(this.buttons)) * 31) + Boolean.hashCode(this.inputs)) * 31) + Boolean.hashCode(this.listOption)) * 31) + Boolean.hashCode(this.spinner)) * 31) + Boolean.hashCode(this.illustration)) * 31) + Boolean.hashCode(this.branding)) * 31) + Boolean.hashCode(this.regulated);
    }

    public String toString() {
        return "MerchantConfigResponse(name=" + this.name + ", logoUri=" + this.logoUri + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", tertiaryColor=" + this.tertiaryColor + ", colors=" + this.colors + ", fonts=" + this.fonts + ", buttons=" + this.buttons + ", inputs=" + this.inputs + ", listOption=" + this.listOption + ", spinner=" + this.spinner + ", illustration=" + this.illustration + ", branding=" + this.branding + ", regulated=" + this.regulated + ")";
    }

    /* compiled from: MerchantConfigResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/MerchantConfigResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/MerchantConfigResponse;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MerchantConfigResponse> serializer() {
            return MerchantConfigResponse2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ MerchantConfigResponse(int i, @SerialName("name") String str, @SerialName("logo_uri") String str2, @SerialName("primary_color") String str3, @SerialName("secondary_color") String str4, @SerialName("tertiary_color") String str5, @SerialName("colors") boolean z, @SerialName("fonts") boolean z2, @SerialName(CarResultComposable2.BUTTONS) boolean z3, @SerialName("inputs") boolean z4, @SerialName("list_option") boolean z5, @SerialName("spinner") boolean z6, @SerialName("illustration") boolean z7, @SerialName("branding") boolean z8, @SerialName("regulated") boolean z9, SerializationConstructorMarker serializationConstructorMarker) {
        if (16353 != (i & 16353)) {
            PluginExceptions.throwMissingFieldException(i, 16353, MerchantConfigResponse2.INSTANCE.getDescriptor());
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.logoUri = null;
        } else {
            this.logoUri = str2;
        }
        if ((i & 4) == 0) {
            this.primaryColor = null;
        } else {
            this.primaryColor = str3;
        }
        if ((i & 8) == 0) {
            this.secondaryColor = null;
        } else {
            this.secondaryColor = str4;
        }
        if ((i & 16) == 0) {
            this.tertiaryColor = null;
        } else {
            this.tertiaryColor = str5;
        }
        this.colors = z;
        this.fonts = z2;
        this.buttons = z3;
        this.inputs = z4;
        this.listOption = z5;
        this.spinner = z6;
        this.illustration = z7;
        this.branding = z8;
        this.regulated = z9;
    }

    public MerchantConfigResponse(String name, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.logoUri = str;
        this.primaryColor = str2;
        this.secondaryColor = str3;
        this.tertiaryColor = str4;
        this.colors = z;
        this.fonts = z2;
        this.buttons = z3;
        this.inputs = z4;
        this.listOption = z5;
        this.spinner = z6;
        this.illustration = z7;
        this.branding = z8;
        this.regulated = z9;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(MerchantConfigResponse self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.logoUri != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.logoUri);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.primaryColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.primaryColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.secondaryColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.secondaryColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.tertiaryColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.tertiaryColor);
        }
        output.encodeBooleanElement(serialDesc, 5, self.colors);
        output.encodeBooleanElement(serialDesc, 6, self.fonts);
        output.encodeBooleanElement(serialDesc, 7, self.buttons);
        output.encodeBooleanElement(serialDesc, 8, self.inputs);
        output.encodeBooleanElement(serialDesc, 9, self.listOption);
        output.encodeBooleanElement(serialDesc, 10, self.spinner);
        output.encodeBooleanElement(serialDesc, 11, self.illustration);
        output.encodeBooleanElement(serialDesc, 12, self.branding);
        output.encodeBooleanElement(serialDesc, 13, self.regulated);
    }

    public /* synthetic */ MerchantConfigResponse(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, z, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    public final String getName() {
        return this.name;
    }

    public final String getLogoUri() {
        return this.logoUri;
    }

    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    public final String getSecondaryColor() {
        return this.secondaryColor;
    }

    public final String getTertiaryColor() {
        return this.tertiaryColor;
    }

    public final boolean getColors() {
        return this.colors;
    }

    public final boolean getFonts() {
        return this.fonts;
    }

    public final boolean getButtons() {
        return this.buttons;
    }

    public final boolean getInputs() {
        return this.inputs;
    }

    public final boolean getListOption() {
        return this.listOption;
    }

    public final boolean getSpinner() {
        return this.spinner;
    }

    public final boolean getIllustration() {
        return this.illustration;
    }

    public final boolean getBranding() {
        return this.branding;
    }

    public final boolean getRegulated() {
        return this.regulated;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public MerchantConfig intoDomain2() {
        String str = this.name;
        URL urlTryLogoUrlParse = tryLogoUrlParse();
        String str2 = this.primaryColor;
        Integer numValueOf = str2 != null ? Integer.valueOf(Color.parseColor(str2)) : null;
        String str3 = this.primaryColor;
        Integer numValueOf2 = str3 != null ? Integer.valueOf(Color.parseColor(str3)) : null;
        String str4 = this.primaryColor;
        return new MerchantConfig(str, urlTryLogoUrlParse, numValueOf, numValueOf2, str4 != null ? Integer.valueOf(Color.parseColor(str4)) : null, this.colors, this.fonts, this.buttons, this.inputs, this.listOption, this.spinner, this.illustration, this.branding, this.regulated);
    }

    private final URL tryLogoUrlParse() {
        try {
            String str = this.logoUri;
            if (str != null) {
                return new URI(str).toURL();
            }
            return null;
        } catch (Throwable th) {
            TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.WTF(null, "Unable to parse logo_uri: " + this.logoUri, ExceptionsKt.stackTraceToString(th), null, null, null, 57, null));
            return null;
        }
    }
}
