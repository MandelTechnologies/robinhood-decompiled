package com.truelayer.payments.core.domain.payments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdditionalInput.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\t¨\u0006\n"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AdditionalInput;", "", "key", "", "getKey", "()Ljava/lang/String;", "Companion", "Info", "InfoElement", "Lcom/truelayer/payments/core/domain/payments/AdditionalInput$Info;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface AdditionalInput {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    String getKey();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdditionalInput.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AdditionalInput$InfoElement;", "", "(Ljava/lang/String;I)V", "Banner", "Unknown", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class InfoElement {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InfoElement[] $VALUES;
        public static final InfoElement Banner = new InfoElement("Banner", 0);
        public static final InfoElement Unknown = new InfoElement("Unknown", 1);

        private static final /* synthetic */ InfoElement[] $values() {
            return new InfoElement[]{Banner, Unknown};
        }

        public static EnumEntries<InfoElement> getEntries() {
            return $ENTRIES;
        }

        public static InfoElement valueOf(String str) {
            return (InfoElement) Enum.valueOf(InfoElement.class, str);
        }

        public static InfoElement[] values() {
            return (InfoElement[]) $VALUES.clone();
        }

        private InfoElement(String str, int i) {
        }

        static {
            InfoElement[] infoElementArr$values = $values();
            $VALUES = infoElementArr$values;
            $ENTRIES = EnumEntries2.enumEntries(infoElementArr$values);
        }
    }

    /* compiled from: AdditionalInput.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AdditionalInput$Info;", "Lcom/truelayer/payments/core/domain/payments/AdditionalInput;", "key", "", "element", "Lcom/truelayer/payments/core/domain/payments/AdditionalInput$InfoElement;", "text", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/AdditionalInput$InfoElement;Ljava/lang/String;)V", "getElement", "()Lcom/truelayer/payments/core/domain/payments/AdditionalInput$InfoElement;", "getKey", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Info implements AdditionalInput {
        private final InfoElement element;
        private final String key;
        private final String text;

        public static /* synthetic */ Info copy$default(Info info, String str, InfoElement infoElement, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = info.key;
            }
            if ((i & 2) != 0) {
                infoElement = info.element;
            }
            if ((i & 4) != 0) {
                str2 = info.text;
            }
            return info.copy(str, infoElement, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final InfoElement getElement() {
            return this.element;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Info copy(String key, InfoElement element, String text) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(element, "element");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Info(key, element, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.areEqual(this.key, info.key) && this.element == info.element && Intrinsics.areEqual(this.text, info.text);
        }

        public int hashCode() {
            return (((this.key.hashCode() * 31) + this.element.hashCode()) * 31) + this.text.hashCode();
        }

        public String toString() {
            return "Info(key=" + this.key + ", element=" + this.element + ", text=" + this.text + ")";
        }

        public Info(String key, InfoElement element, String text) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(element, "element");
            Intrinsics.checkNotNullParameter(text, "text");
            this.key = key;
            this.element = element;
            this.text = text;
        }

        @Override // com.truelayer.payments.core.domain.payments.AdditionalInput
        public String getKey() {
            return this.key;
        }

        public final InfoElement getElement() {
            return this.element;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: AdditionalInput.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AdditionalInput$Companion;", "", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
