package com.withpersona.sdk2.inquiry.network.dto.p421ui.components;

import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Button.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\nR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "ButtonType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ActionButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CancelButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CompleteButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/SubmitButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface Button extends UiComponentConfig {
    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    BaseButtonAttributes getAttributes();

    ButtonComponentStyling getStyles();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Button.kt */
    @JsonClass(generateAdapter = false)
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "Companion", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ButtonType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ButtonType PRIMARY = new ButtonType("PRIMARY", 0);
        public static final ButtonType SECONDARY = new ButtonType("SECONDARY", 1);

        private static final /* synthetic */ ButtonType[] $values() {
            return new ButtonType[]{PRIMARY, SECONDARY};
        }

        public static EnumEntries<ButtonType> getEntries() {
            return $ENTRIES;
        }

        private ButtonType(String str, int i) {
        }

        static {
            ButtonType[] buttonTypeArr$values = $values();
            $VALUES = buttonTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(buttonTypeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: Button.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Companion extends JsonAdapter<ButtonType> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, ButtonType value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public ButtonType fromJson(JsonReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object jsonValue = reader.readJsonValue();
                return Intrinsics.areEqual(jsonValue, InstantRetirementSplashScreen.PrimaryButtonTag) ? ButtonType.PRIMARY : Intrinsics.areEqual(jsonValue, InstantRetirementSplashScreen.SecondaryButtonTag) ? ButtonType.SECONDARY : ButtonType.PRIMARY;
            }
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }
}
