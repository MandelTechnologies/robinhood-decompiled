package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.robinhood.android.navigation.compose.NavTransition2;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FallbackModeService.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ProductionEndpoint;", "", "<init>", "(Ljava/lang/String;I)V", "Transition", "TransitionBack", "DocumentFilesPost", "DocumentFilesDelete", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.ProductionEndpoint, reason: use source file name */
/* loaded from: classes18.dex */
public final class FallbackModeService2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FallbackModeService2[] $VALUES;

    @Json(name = NavTransition2.KEY_TRANSITION)
    public static final FallbackModeService2 Transition = new FallbackModeService2("Transition", 0);

    @Json(name = "transition-back")
    public static final FallbackModeService2 TransitionBack = new FallbackModeService2("TransitionBack", 1);

    @Json(name = "document-files-post")
    public static final FallbackModeService2 DocumentFilesPost = new FallbackModeService2("DocumentFilesPost", 2);

    @Json(name = "document-files-delete")
    public static final FallbackModeService2 DocumentFilesDelete = new FallbackModeService2("DocumentFilesDelete", 3);

    private static final /* synthetic */ FallbackModeService2[] $values() {
        return new FallbackModeService2[]{Transition, TransitionBack, DocumentFilesPost, DocumentFilesDelete};
    }

    public static EnumEntries<FallbackModeService2> getEntries() {
        return $ENTRIES;
    }

    private FallbackModeService2(String str, int i) {
    }

    static {
        FallbackModeService2[] fallbackModeService2Arr$values = $values();
        $VALUES = fallbackModeService2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(fallbackModeService2Arr$values);
    }

    public static FallbackModeService2 valueOf(String str) {
        return (FallbackModeService2) Enum.valueOf(FallbackModeService2.class, str);
    }

    public static FallbackModeService2[] values() {
        return (FallbackModeService2[]) $VALUES.clone();
    }
}
