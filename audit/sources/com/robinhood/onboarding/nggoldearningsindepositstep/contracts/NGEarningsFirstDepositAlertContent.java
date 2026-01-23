package com.robinhood.onboarding.nggoldearningsindepositstep.contracts;

import com.plaid.internal.EnumC7081g;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.p507ui.sdui.SduiPictogram;

/* compiled from: Models.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B_\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001J&\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-HÁ\u0001¢\u0006\u0002\b.R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u00061"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;", "", "seen1", "", "pog", "Lmicrogram/ui/sdui/SduiPictogram;", "title", "", "bodyMarkdown", "disclosureMarkdown", "primaryCtaTitle", "secondaryCtaTitle", "primaryCtaDeeplink", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILmicrogram/ui/sdui/SduiPictogram;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lmicrogram/ui/sdui/SduiPictogram;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBodyMarkdown", "()Ljava/lang/String;", "getDisclosureMarkdown", "getPog", "()Lmicrogram/ui/sdui/SduiPictogram;", "getPrimaryCtaDeeplink", "getPrimaryCtaTitle", "getSecondaryCtaTitle", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes22.dex */
public final /* data */ class NGEarningsFirstDepositAlertContent {
    private final String bodyMarkdown;
    private final String disclosureMarkdown;
    private final SduiPictogram pog;
    private final String primaryCtaDeeplink;
    private final String primaryCtaTitle;
    private final String secondaryCtaTitle;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiPictogram.INSTANCE.serializer(), null, null, null, null, null, null};

    public static /* synthetic */ NGEarningsFirstDepositAlertContent copy$default(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent, SduiPictogram sduiPictogram, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            sduiPictogram = nGEarningsFirstDepositAlertContent.pog;
        }
        if ((i & 2) != 0) {
            str = nGEarningsFirstDepositAlertContent.title;
        }
        if ((i & 4) != 0) {
            str2 = nGEarningsFirstDepositAlertContent.bodyMarkdown;
        }
        if ((i & 8) != 0) {
            str3 = nGEarningsFirstDepositAlertContent.disclosureMarkdown;
        }
        if ((i & 16) != 0) {
            str4 = nGEarningsFirstDepositAlertContent.primaryCtaTitle;
        }
        if ((i & 32) != 0) {
            str5 = nGEarningsFirstDepositAlertContent.secondaryCtaTitle;
        }
        if ((i & 64) != 0) {
            str6 = nGEarningsFirstDepositAlertContent.primaryCtaDeeplink;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return nGEarningsFirstDepositAlertContent.copy(sduiPictogram, str, str10, str3, str9, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final SduiPictogram getPog() {
        return this.pog;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBodyMarkdown() {
        return this.bodyMarkdown;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPrimaryCtaTitle() {
        return this.primaryCtaTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSecondaryCtaTitle() {
        return this.secondaryCtaTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPrimaryCtaDeeplink() {
        return this.primaryCtaDeeplink;
    }

    public final NGEarningsFirstDepositAlertContent copy(SduiPictogram pog, String title, String bodyMarkdown, String disclosureMarkdown, String primaryCtaTitle, String secondaryCtaTitle, String primaryCtaDeeplink) {
        Intrinsics.checkNotNullParameter(pog, "pog");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bodyMarkdown, "bodyMarkdown");
        Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
        Intrinsics.checkNotNullParameter(primaryCtaTitle, "primaryCtaTitle");
        Intrinsics.checkNotNullParameter(secondaryCtaTitle, "secondaryCtaTitle");
        Intrinsics.checkNotNullParameter(primaryCtaDeeplink, "primaryCtaDeeplink");
        return new NGEarningsFirstDepositAlertContent(pog, title, bodyMarkdown, disclosureMarkdown, primaryCtaTitle, secondaryCtaTitle, primaryCtaDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NGEarningsFirstDepositAlertContent)) {
            return false;
        }
        NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent = (NGEarningsFirstDepositAlertContent) other;
        return this.pog == nGEarningsFirstDepositAlertContent.pog && Intrinsics.areEqual(this.title, nGEarningsFirstDepositAlertContent.title) && Intrinsics.areEqual(this.bodyMarkdown, nGEarningsFirstDepositAlertContent.bodyMarkdown) && Intrinsics.areEqual(this.disclosureMarkdown, nGEarningsFirstDepositAlertContent.disclosureMarkdown) && Intrinsics.areEqual(this.primaryCtaTitle, nGEarningsFirstDepositAlertContent.primaryCtaTitle) && Intrinsics.areEqual(this.secondaryCtaTitle, nGEarningsFirstDepositAlertContent.secondaryCtaTitle) && Intrinsics.areEqual(this.primaryCtaDeeplink, nGEarningsFirstDepositAlertContent.primaryCtaDeeplink);
    }

    public int hashCode() {
        return (((((((((((this.pog.hashCode() * 31) + this.title.hashCode()) * 31) + this.bodyMarkdown.hashCode()) * 31) + this.disclosureMarkdown.hashCode()) * 31) + this.primaryCtaTitle.hashCode()) * 31) + this.secondaryCtaTitle.hashCode()) * 31) + this.primaryCtaDeeplink.hashCode();
    }

    public String toString() {
        return "NGEarningsFirstDepositAlertContent(pog=" + this.pog + ", title=" + this.title + ", bodyMarkdown=" + this.bodyMarkdown + ", disclosureMarkdown=" + this.disclosureMarkdown + ", primaryCtaTitle=" + this.primaryCtaTitle + ", secondaryCtaTitle=" + this.secondaryCtaTitle + ", primaryCtaDeeplink=" + this.primaryCtaDeeplink + ")";
    }

    /* compiled from: Models.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NGEarningsFirstDepositAlertContent> serializer() {
            return NGEarningsFirstDepositAlertContent$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ NGEarningsFirstDepositAlertContent(int i, SduiPictogram sduiPictogram, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE)) {
            PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, NGEarningsFirstDepositAlertContent$$serializer.INSTANCE.getDescriptor());
        }
        this.pog = sduiPictogram;
        this.title = str;
        this.bodyMarkdown = str2;
        this.disclosureMarkdown = str3;
        this.primaryCtaTitle = str4;
        this.secondaryCtaTitle = str5;
        this.primaryCtaDeeplink = str6;
    }

    public NGEarningsFirstDepositAlertContent(SduiPictogram pog, String title, String bodyMarkdown, String disclosureMarkdown, String primaryCtaTitle, String secondaryCtaTitle, String primaryCtaDeeplink) {
        Intrinsics.checkNotNullParameter(pog, "pog");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bodyMarkdown, "bodyMarkdown");
        Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
        Intrinsics.checkNotNullParameter(primaryCtaTitle, "primaryCtaTitle");
        Intrinsics.checkNotNullParameter(secondaryCtaTitle, "secondaryCtaTitle");
        Intrinsics.checkNotNullParameter(primaryCtaDeeplink, "primaryCtaDeeplink");
        this.pog = pog;
        this.title = title;
        this.bodyMarkdown = bodyMarkdown;
        this.disclosureMarkdown = disclosureMarkdown;
        this.primaryCtaTitle = primaryCtaTitle;
        this.secondaryCtaTitle = secondaryCtaTitle;
        this.primaryCtaDeeplink = primaryCtaDeeplink;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(NGEarningsFirstDepositAlertContent self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.pog);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.bodyMarkdown);
        output.encodeStringElement(serialDesc, 3, self.disclosureMarkdown);
        output.encodeStringElement(serialDesc, 4, self.primaryCtaTitle);
        output.encodeStringElement(serialDesc, 5, self.secondaryCtaTitle);
        output.encodeStringElement(serialDesc, 6, self.primaryCtaDeeplink);
    }

    public final SduiPictogram getPog() {
        return this.pog;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBodyMarkdown() {
        return this.bodyMarkdown;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final String getPrimaryCtaTitle() {
        return this.primaryCtaTitle;
    }

    public final String getSecondaryCtaTitle() {
        return this.secondaryCtaTitle;
    }

    public final String getPrimaryCtaDeeplink() {
        return this.primaryCtaDeeplink;
    }
}
