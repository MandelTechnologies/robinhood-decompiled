package com.robinhood.android.navigation.app.keys.data;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GoldReferenceManualPage.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/GoldReferenceManualPage;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "OVERVIEW", "RESEARCH", "INSTANT", "MARGIN", "LEVEL_2", "Companion", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class GoldReferenceManualPage implements RhEnum<GoldReferenceManualPage> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GoldReferenceManualPage[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final GoldReferenceManualPage OVERVIEW = new GoldReferenceManualPage("OVERVIEW", 0, "overview");
    public static final GoldReferenceManualPage RESEARCH = new GoldReferenceManualPage("RESEARCH", 1, GoldFeature.RESEARCH);
    public static final GoldReferenceManualPage INSTANT = new GoldReferenceManualPage("INSTANT", 2, GoldFeature.INSTANT);
    public static final GoldReferenceManualPage MARGIN = new GoldReferenceManualPage("MARGIN", 3, GoldFeature.MARGIN);
    public static final GoldReferenceManualPage LEVEL_2 = new GoldReferenceManualPage("LEVEL_2", 4, "level-2");

    private static final /* synthetic */ GoldReferenceManualPage[] $values() {
        return new GoldReferenceManualPage[]{OVERVIEW, RESEARCH, INSTANT, MARGIN, LEVEL_2};
    }

    public static EnumEntries<GoldReferenceManualPage> getEntries() {
        return $ENTRIES;
    }

    private GoldReferenceManualPage(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        GoldReferenceManualPage[] goldReferenceManualPageArr$values = $values();
        $VALUES = goldReferenceManualPageArr$values;
        $ENTRIES = EnumEntries2.enumEntries(goldReferenceManualPageArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: GoldReferenceManualPage.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/GoldReferenceManualPage$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Optional;", "Lcom/robinhood/android/navigation/app/keys/data/GoldReferenceManualPage;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Optional<GoldReferenceManualPage> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(GoldReferenceManualPage.values(), false, 2, null);
        }
    }

    public static GoldReferenceManualPage valueOf(String str) {
        return (GoldReferenceManualPage) Enum.valueOf(GoldReferenceManualPage.class, str);
    }

    public static GoldReferenceManualPage[] values() {
        return (GoldReferenceManualPage[]) $VALUES.clone();
    }
}
