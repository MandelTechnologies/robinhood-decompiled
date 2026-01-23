package com.robinhood.shared.documents.lib.docupload;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.compose.bento.theme.BentoColor;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PersonaFlowStyle.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/PersonaFlowStyle;", "Landroid/os/Parcelable;", "", "splashScreenStyle", "Lcom/robinhood/shared/documents/lib/docupload/SplashScreenStyle;", "personaScreenStyle", "Lcom/robinhood/shared/documents/lib/docupload/PersonaScreenStyle;", "showThankYouScreen", "", "<init>", "(Ljava/lang/String;ILcom/robinhood/shared/documents/lib/docupload/SplashScreenStyle;Lcom/robinhood/shared/documents/lib/docupload/PersonaScreenStyle;Z)V", "getSplashScreenStyle", "()Lcom/robinhood/shared/documents/lib/docupload/SplashScreenStyle;", "getPersonaScreenStyle", "()Lcom/robinhood/shared/documents/lib/docupload/PersonaScreenStyle;", "getShowThankYouScreen", "()Z", "BROKERAGE", "BROKERAGE_V2", "CRYPTO", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PersonaFlowStyle implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PersonaFlowStyle[] $VALUES;
    public static final PersonaFlowStyle BROKERAGE;
    public static final PersonaFlowStyle BROKERAGE_V2;
    public static final Parcelable.Creator<PersonaFlowStyle> CREATOR;
    public static final PersonaFlowStyle CRYPTO;
    private final PersonaScreenStyle personaScreenStyle;
    private final boolean showThankYouScreen;
    private final SplashScreenStyle splashScreenStyle;

    private static final /* synthetic */ PersonaFlowStyle[] $values() {
        return new PersonaFlowStyle[]{BROKERAGE, BROKERAGE_V2, CRYPTO};
    }

    public static EnumEntries<PersonaFlowStyle> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private PersonaFlowStyle(String str, int i, SplashScreenStyle splashScreenStyle, PersonaScreenStyle personaScreenStyle, boolean z) {
        this.splashScreenStyle = splashScreenStyle;
        this.personaScreenStyle = personaScreenStyle;
        this.showThankYouScreen = z;
    }

    public final SplashScreenStyle getSplashScreenStyle() {
        return this.splashScreenStyle;
    }

    public final PersonaScreenStyle getPersonaScreenStyle() {
        return this.personaScreenStyle;
    }

    public final boolean getShowThankYouScreen() {
        return this.showThankYouScreen;
    }

    static {
        int i = C38750R.drawable.selfie_hero;
        BentoColor bentoColor = BentoColor.INSTANCE;
        BROKERAGE = new PersonaFlowStyle("BROKERAGE", 0, new SplashScreenStyle(i, bentoColor.m21199getDayDot0d7_KjU(), C38750R.string.doc_upload_assistant_title, C38750R.string.persona_start_verify_identity_splash_subtitle, false, null), new PersonaScreenStyle(new DocumentBasedPersonaScreenContent(C38750R.drawable.photo_id_hero, C38750R.string.persona_start_photo_id_title_v2, C38750R.string.persona_start_photo_id_subtitle, C38750R.string.persona_start_photo_id_primary_cta_text, null, 16, null), new DocumentBasedPersonaScreenContent(C38750R.drawable.selfie_hero, C38750R.string.persona_start_selfie_title, C38750R.string.persona_start_selfie_subtitle, C38750R.string.persona_start_selfie_primary_cta_text, null, 16, null), new DocumentBasedPersonaScreenContent(C38750R.drawable.photo_id_hero, C38750R.string.persona_start_photo_id_title_v2, C38750R.string.persona_start_photo_id_subtitle, C38750R.string.persona_start_photo_id_gdpr_primary_cta_text, null, 16, null)), true);
        BROKERAGE_V2 = new PersonaFlowStyle("BROKERAGE_V2", 1, new SplashScreenStyle(C38750R.drawable.selfie_hero, bentoColor.m21199getDayDot0d7_KjU(), C38750R.string.doc_upload_assistant_title, C38750R.string.persona_start_verify_identity_splash_subtitle, false, null), new PersonaScreenStyle(new DocumentBasedPersonaScreenContent(C38750R.drawable.photo_id_hero, C38750R.string.persona_start_photo_id_title_v2, C38750R.string.persona_start_photo_id_subtitle, C38750R.string.persona_start_photo_id_primary_cta_text, null, 16, null), new DocumentBasedPersonaScreenContent(C38750R.drawable.selfie_hero, C38750R.string.persona_start_selfie_title, C38750R.string.persona_start_selfie_subtitle, C38750R.string.persona_start_selfie_primary_cta_text, null, 16, null), new DocumentBasedPersonaScreenContent(C38750R.drawable.photo_id_hero, C38750R.string.persona_start_photo_id_title_v2, C38750R.string.persona_start_photo_id_subtitle, C38750R.string.persona_start_photo_id_gdpr_primary_cta_text, null, 16, null)), false);
        CRYPTO = new PersonaFlowStyle("CRYPTO", 2, new SplashScreenStyle(C38750R.drawable.selfie_hero_crypto, bentoColor.m21154getCryptoBg20d7_KjU(), C38750R.string.doc_upload_assistant_title_crypto, C38750R.string.persona_start_verify_identity_splash_subtitle_crypto, false, null), new PersonaScreenStyle(new DocumentBasedPersonaScreenContent(C38750R.drawable.photo_id_hero_crypto, C38750R.string.persona_start_photo_id_title_crypto, C38750R.string.persona_start_photo_id_subtitle, C38750R.string.persona_start_photo_id_primary_cta_text, null, 16, null), new DocumentBasedPersonaScreenContent(C38750R.drawable.selfie_hero_crypto, C38750R.string.persona_start_selfie_title, C38750R.string.persona_start_selfie_subtitle, C38750R.string.persona_start_selfie_primary_cta_text, null, 16, null), new DocumentBasedPersonaScreenContent(C38750R.drawable.photo_id_hero_crypto, C38750R.string.persona_start_photo_id_gdpr_title, C38750R.string.persona_start_photo_id_gdpr_subtitle, C38750R.string.persona_start_photo_id_gdpr_primary_cta_text, Integer.valueOf(C38750R.string.persona_start_photo_id_gdpr_secondary_cta_text))), false);
        PersonaFlowStyle[] personaFlowStyleArr$values = $values();
        $VALUES = personaFlowStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(personaFlowStyleArr$values);
        CREATOR = new Parcelable.Creator<PersonaFlowStyle>() { // from class: com.robinhood.shared.documents.lib.docupload.PersonaFlowStyle.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PersonaFlowStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return PersonaFlowStyle.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PersonaFlowStyle[] newArray(int i2) {
                return new PersonaFlowStyle[i2];
            }
        };
    }

    public static PersonaFlowStyle valueOf(String str) {
        return (PersonaFlowStyle) Enum.valueOf(PersonaFlowStyle.class, str);
    }

    public static PersonaFlowStyle[] values() {
        return (PersonaFlowStyle[]) $VALUES.clone();
    }
}
