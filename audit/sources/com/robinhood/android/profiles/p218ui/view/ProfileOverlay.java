package com.robinhood.android.profiles.p218ui.view;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.profiles.p218ui.C25904R;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfileOverlay.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfileOverlay;", "Lcom/robinhood/scarlet/ScarletOverlay;", "", "styleResId", "", "<init>", "(Ljava/lang/String;II)V", "BLACK", "BLUE", "DARK_BLUE", "GOLD", "ORANGE", "MAGENTA", "PINK", "PURPLE", "TEAL", "styleReference", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "priority", "getPriority", "()I", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfileOverlay implements ScarletOverlay {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProfileOverlay[] $VALUES;
    private final DirectResourceReference<StyleResource> styleReference;
    public static final ProfileOverlay BLACK = new ProfileOverlay("BLACK", 0, C25904R.style.ThemeOverlay_Robinhood_DesignSystem_Profile_Black);
    public static final ProfileOverlay BLUE = new ProfileOverlay("BLUE", 1, C25904R.style.ThemeOverlay_Robinhood_DesignSystem_Profile_Blue);
    public static final ProfileOverlay DARK_BLUE = new ProfileOverlay("DARK_BLUE", 2, C25904R.style.ThemeOverlay_Robinhood_DesignSystem_Profile_DarkBlue);
    public static final ProfileOverlay GOLD = new ProfileOverlay("GOLD", 3, C25904R.style.ThemeOverlay_Robinhood_DesignSystem_Profile_Gold);
    public static final ProfileOverlay ORANGE = new ProfileOverlay("ORANGE", 4, C25904R.style.ThemeOverlay_Robinhood_DesignSystem_Profile_Orange);
    public static final ProfileOverlay MAGENTA = new ProfileOverlay("MAGENTA", 5, C25904R.style.ThemeOverlay_Robinhood_DesignSystem_Profile_Magenta);
    public static final ProfileOverlay PINK = new ProfileOverlay("PINK", 6, C25904R.style.ThemeOverlay_Robinhood_DesignSystem_Profile_Pink);
    public static final ProfileOverlay PURPLE = new ProfileOverlay("PURPLE", 7, C25904R.style.ThemeOverlay_Robinhood_DesignSystem_Profile_Purple);
    public static final ProfileOverlay TEAL = new ProfileOverlay("TEAL", 8, C25904R.style.ThemeOverlay_Robinhood_DesignSystem_Profile_Teal);

    private static final /* synthetic */ ProfileOverlay[] $values() {
        return new ProfileOverlay[]{BLACK, BLUE, DARK_BLUE, GOLD, ORANGE, MAGENTA, PINK, PURPLE, TEAL};
    }

    public static EnumEntries<ProfileOverlay> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public int getPriority() {
        return EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
    }

    private ProfileOverlay(String str, int i, int i2) {
        this.styleReference = new DirectResourceReference<>(ResourceType.STYLE.INSTANCE, i2);
    }

    static {
        ProfileOverlay[] profileOverlayArr$values = $values();
        $VALUES = profileOverlayArr$values;
        $ENTRIES = EnumEntries2.enumEntries(profileOverlayArr$values);
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public DirectResourceReference<StyleResource> getStyleReference() {
        return this.styleReference;
    }

    public static ProfileOverlay valueOf(String str) {
        return (ProfileOverlay) Enum.valueOf(ProfileOverlay.class, str);
    }

    public static ProfileOverlay[] values() {
        return (ProfileOverlay[]) $VALUES.clone();
    }
}
