package com.truelayer.payments.core.domain.payments;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TranslatableText.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u001c\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "Lcom/truelayer/payments/core/domain/payments/Translatable;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "", "key", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "text", "getText", "translatedText", "applyTranslation", "", "translationsMap", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TranslatableText implements TranslatableText2 {
    private final String default;
    private final String key;
    private String translatedText;

    /* renamed from: component1, reason: from getter */
    private final String getDefault() {
        return this.default;
    }

    public static /* synthetic */ TranslatableText copy$default(TranslatableText translatableText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = translatableText.default;
        }
        if ((i & 2) != 0) {
            str2 = translatableText.key;
        }
        return translatableText.copy(str, str2);
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final TranslatableText copy(String str, String key) {
        Intrinsics.checkNotNullParameter(str, "default");
        return new TranslatableText(str, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslatableText)) {
            return false;
        }
        TranslatableText translatableText = (TranslatableText) other;
        return Intrinsics.areEqual(this.default, translatableText.default) && Intrinsics.areEqual(this.key, translatableText.key);
    }

    public int hashCode() {
        int iHashCode = this.default.hashCode() * 31;
        String str = this.key;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TranslatableText(default=" + this.default + ", key=" + this.key + ")";
    }

    public TranslatableText(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "default");
        this.default = str;
        this.key = str2;
    }

    public /* synthetic */ TranslatableText(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getText() {
        String str = this.translatedText;
        return str == null ? this.default : str;
    }

    @Override // com.truelayer.payments.core.domain.payments.TranslatableText2
    public void applyTranslation(Map<String, LocalisedText> translationsMap) {
        Intrinsics.checkNotNullParameter(translationsMap, "translationsMap");
        String str = this.key;
        if (str != null) {
            LocalisedText localisedText = translationsMap.get(str);
            this.translatedText = localisedText != null ? localisedText.getValue() : null;
        }
    }
}
