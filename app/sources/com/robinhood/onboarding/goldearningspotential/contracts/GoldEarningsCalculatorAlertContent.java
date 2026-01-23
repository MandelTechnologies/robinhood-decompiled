package com.robinhood.onboarding.goldearningspotential.contracts;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GoldEarningsModel.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BK\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(R$\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006+"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorAlertContent;", "", "seen1", "", "dismissLabel", "", "bodyMarkdown", "bodyComponents", "", "title", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getBodyComponents$annotations", "()V", "getBodyComponents", "()Ljava/util/List;", "getBodyMarkdown$annotations", "getBodyMarkdown", "()Ljava/lang/String;", "getDismissLabel", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes22.dex */
public final /* data */ class GoldEarningsCalculatorAlertContent {
    private final List<String> bodyComponents;
    private final String bodyMarkdown;
    private final String dismissLabel;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoldEarningsCalculatorAlertContent copy$default(GoldEarningsCalculatorAlertContent goldEarningsCalculatorAlertContent, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldEarningsCalculatorAlertContent.dismissLabel;
        }
        if ((i & 2) != 0) {
            str2 = goldEarningsCalculatorAlertContent.bodyMarkdown;
        }
        if ((i & 4) != 0) {
            list = goldEarningsCalculatorAlertContent.bodyComponents;
        }
        if ((i & 8) != 0) {
            str3 = goldEarningsCalculatorAlertContent.title;
        }
        return goldEarningsCalculatorAlertContent.copy(str, str2, list, str3);
    }

    @SerialName("body_components")
    public static /* synthetic */ void getBodyComponents$annotations() {
    }

    @SerialName("body_markdown")
    public static /* synthetic */ void getBodyMarkdown$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getDismissLabel() {
        return this.dismissLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBodyMarkdown() {
        return this.bodyMarkdown;
    }

    public final List<String> component3() {
        return this.bodyComponents;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final GoldEarningsCalculatorAlertContent copy(String dismissLabel, String bodyMarkdown, List<String> bodyComponents, String title) {
        Intrinsics.checkNotNullParameter(dismissLabel, "dismissLabel");
        Intrinsics.checkNotNullParameter(title, "title");
        return new GoldEarningsCalculatorAlertContent(dismissLabel, bodyMarkdown, bodyComponents, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldEarningsCalculatorAlertContent)) {
            return false;
        }
        GoldEarningsCalculatorAlertContent goldEarningsCalculatorAlertContent = (GoldEarningsCalculatorAlertContent) other;
        return Intrinsics.areEqual(this.dismissLabel, goldEarningsCalculatorAlertContent.dismissLabel) && Intrinsics.areEqual(this.bodyMarkdown, goldEarningsCalculatorAlertContent.bodyMarkdown) && Intrinsics.areEqual(this.bodyComponents, goldEarningsCalculatorAlertContent.bodyComponents) && Intrinsics.areEqual(this.title, goldEarningsCalculatorAlertContent.title);
    }

    public int hashCode() {
        int iHashCode = this.dismissLabel.hashCode() * 31;
        String str = this.bodyMarkdown;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.bodyComponents;
        return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "GoldEarningsCalculatorAlertContent(dismissLabel=" + this.dismissLabel + ", bodyMarkdown=" + this.bodyMarkdown + ", bodyComponents=" + this.bodyComponents + ", title=" + this.title + ")";
    }

    /* compiled from: GoldEarningsModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorAlertContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorAlertContent;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GoldEarningsCalculatorAlertContent> serializer() {
            return GoldEarningsCalculatorAlertContent$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ GoldEarningsCalculatorAlertContent(int i, String str, @SerialName("body_markdown") String str2, @SerialName("body_components") List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, GoldEarningsCalculatorAlertContent$$serializer.INSTANCE.getDescriptor());
        }
        this.dismissLabel = str;
        this.bodyMarkdown = str2;
        this.bodyComponents = list;
        this.title = str3;
    }

    public GoldEarningsCalculatorAlertContent(String dismissLabel, String str, List<String> list, String title) {
        Intrinsics.checkNotNullParameter(dismissLabel, "dismissLabel");
        Intrinsics.checkNotNullParameter(title, "title");
        this.dismissLabel = dismissLabel;
        this.bodyMarkdown = str;
        this.bodyComponents = list;
        this.title = title;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(GoldEarningsCalculatorAlertContent self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.dismissLabel);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.bodyMarkdown);
        output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.bodyComponents);
        output.encodeStringElement(serialDesc, 3, self.title);
    }

    public final String getDismissLabel() {
        return this.dismissLabel;
    }

    public final String getBodyMarkdown() {
        return this.bodyMarkdown;
    }

    public final List<String> getBodyComponents() {
        return this.bodyComponents;
    }

    public final String getTitle() {
        return this.title;
    }
}
