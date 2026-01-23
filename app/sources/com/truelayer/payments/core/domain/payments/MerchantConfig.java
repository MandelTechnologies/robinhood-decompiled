package com.truelayer.payments.core.domain.payments;

import android.graphics.Color;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MerchantConfig.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0002\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J¢\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0007HÖ\u0001J\n\u0010;\u001a\u0004\u0018\u00010<H\u0007J\n\u0010=\u001a\u0004\u0018\u00010<H\u0007J\n\u0010>\u001a\u0004\u0018\u00010<H\u0007J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b%\u0010\"R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"¨\u0006A"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "", "name", "", "logoUri", "Ljava/net/URL;", "primaryColor", "", "secondaryColor", "tertiaryColor", "colors", "", "fonts", CarResultComposable2.BUTTONS, "inputs", "listOption", "spinner", "illustration", "branding", "regulated", "(Ljava/lang/String;Ljava/net/URL;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZZZZZZZZ)V", "getBranding", "()Z", "getButtons", "getColors", "getFonts", "getIllustration", "getInputs", "getListOption", "getLogoUri", "()Ljava/net/URL;", "getName", "()Ljava/lang/String;", "getPrimaryColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegulated", "getSecondaryColor", "getSpinner", "getTertiaryColor", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/net/URL;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZZZZZZZZ)Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "equals", "other", "hashCode", InstantRetirementSplashScreen.PrimaryButtonTag, "Landroid/graphics/Color;", InstantRetirementSplashScreen.SecondaryButtonTag, "tertiary", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class MerchantConfig {
    private final boolean branding;
    private final boolean buttons;
    private final boolean colors;
    private final boolean fonts;
    private final boolean illustration;
    private final boolean inputs;
    private final boolean listOption;
    private final URL logoUri;
    private final String name;
    private final Integer primaryColor;
    private final boolean regulated;
    private final Integer secondaryColor;
    private final boolean spinner;
    private final Integer tertiaryColor;

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
    public final URL getLogoUri() {
        return this.logoUri;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getPrimaryColor() {
        return this.primaryColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getSecondaryColor() {
        return this.secondaryColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getTertiaryColor() {
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

    public final MerchantConfig copy(String name, URL logoUri, Integer primaryColor, Integer secondaryColor, Integer tertiaryColor, boolean colors, boolean fonts, boolean buttons, boolean inputs, boolean listOption, boolean spinner, boolean illustration, boolean branding, boolean regulated) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new MerchantConfig(name, logoUri, primaryColor, secondaryColor, tertiaryColor, colors, fonts, buttons, inputs, listOption, spinner, illustration, branding, regulated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantConfig)) {
            return false;
        }
        MerchantConfig merchantConfig = (MerchantConfig) other;
        return Intrinsics.areEqual(this.name, merchantConfig.name) && Intrinsics.areEqual(this.logoUri, merchantConfig.logoUri) && Intrinsics.areEqual(this.primaryColor, merchantConfig.primaryColor) && Intrinsics.areEqual(this.secondaryColor, merchantConfig.secondaryColor) && Intrinsics.areEqual(this.tertiaryColor, merchantConfig.tertiaryColor) && this.colors == merchantConfig.colors && this.fonts == merchantConfig.fonts && this.buttons == merchantConfig.buttons && this.inputs == merchantConfig.inputs && this.listOption == merchantConfig.listOption && this.spinner == merchantConfig.spinner && this.illustration == merchantConfig.illustration && this.branding == merchantConfig.branding && this.regulated == merchantConfig.regulated;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        URL url = this.logoUri;
        int iHashCode2 = (iHashCode + (url == null ? 0 : url.hashCode())) * 31;
        Integer num = this.primaryColor;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.secondaryColor;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.tertiaryColor;
        return ((((((((((((((((((iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31) + Boolean.hashCode(this.colors)) * 31) + Boolean.hashCode(this.fonts)) * 31) + Boolean.hashCode(this.buttons)) * 31) + Boolean.hashCode(this.inputs)) * 31) + Boolean.hashCode(this.listOption)) * 31) + Boolean.hashCode(this.spinner)) * 31) + Boolean.hashCode(this.illustration)) * 31) + Boolean.hashCode(this.branding)) * 31) + Boolean.hashCode(this.regulated);
    }

    public String toString() {
        return "MerchantConfig(name=" + this.name + ", logoUri=" + this.logoUri + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", tertiaryColor=" + this.tertiaryColor + ", colors=" + this.colors + ", fonts=" + this.fonts + ", buttons=" + this.buttons + ", inputs=" + this.inputs + ", listOption=" + this.listOption + ", spinner=" + this.spinner + ", illustration=" + this.illustration + ", branding=" + this.branding + ", regulated=" + this.regulated + ")";
    }

    public MerchantConfig(String name, URL url, Integer num, Integer num2, Integer num3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.logoUri = url;
        this.primaryColor = num;
        this.secondaryColor = num2;
        this.tertiaryColor = num3;
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

    public /* synthetic */ MerchantConfig(String str, URL url, Integer num, Integer num2, Integer num3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, url, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, z, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    public final String getName() {
        return this.name;
    }

    public final URL getLogoUri() {
        return this.logoUri;
    }

    public final Integer getPrimaryColor() {
        return this.primaryColor;
    }

    public final Integer getSecondaryColor() {
        return this.secondaryColor;
    }

    public final Integer getTertiaryColor() {
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

    public final Color primary() {
        Integer num = this.primaryColor;
        if (num != null) {
            return Color.valueOf(num.intValue());
        }
        return null;
    }

    public final Color secondary() {
        Integer num = this.secondaryColor;
        if (num != null) {
            return Color.valueOf(num.intValue());
        }
        return null;
    }

    public final Color tertiary() {
        Integer num = this.tertiaryColor;
        if (num != null) {
            return Color.valueOf(num.intValue());
        }
        return null;
    }
}
