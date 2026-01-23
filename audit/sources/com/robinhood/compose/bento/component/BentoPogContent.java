package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoPog.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoPogContent;", "", "Text", "Pictogram", "RemoteImage", "Lcom/robinhood/compose/bento/component/BentoPogContent$Pictogram;", "Lcom/robinhood/compose/bento/component/BentoPogContent$RemoteImage;", "Lcom/robinhood/compose/bento/component/BentoPogContent$Text;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface BentoPogContent {

    /* compiled from: BentoPog.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoPogContent$Text;", "Lcom/robinhood/compose/bento/component/BentoPogContent;", "text", "", "foregroundColorOverride", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getForegroundColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Text implements BentoPogContent {
        public static final int $stable = 0;
        private final Color foregroundColorOverride;
        private final String text;

        public /* synthetic */ Text(String str, Color color, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, color);
        }

        private Text(String text, Color color) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.foregroundColorOverride = color;
        }

        public /* synthetic */ Text(String str, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : color, null);
        }

        /* renamed from: getForegroundColorOverride-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getForegroundColorOverride() {
            return this.foregroundColorOverride;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: BentoPog.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoPogContent$Pictogram;", "Lcom/robinhood/compose/bento/component/BentoPogContent;", "assetId", "", "contentDescription", "", "foregroundColorOverride", "Landroidx/compose/ui/graphics/Color;", "<init>", "(ILjava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAssetId", "()I", "getContentDescription", "()Ljava/lang/String;", "getForegroundColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Pictogram implements BentoPogContent {
        public static final int $stable = 0;
        private final int assetId;
        private final String contentDescription;
        private final Color foregroundColorOverride;

        public /* synthetic */ Pictogram(int i, String str, Color color, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, color);
        }

        private Pictogram(int i, String str, Color color) {
            this.assetId = i;
            this.contentDescription = str;
            this.foregroundColorOverride = color;
        }

        public /* synthetic */ Pictogram(int i, String str, Color color, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : color, null);
        }

        public final int getAssetId() {
            return this.assetId;
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }

        /* renamed from: getForegroundColorOverride-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getForegroundColorOverride() {
            return this.foregroundColorOverride;
        }
    }

    /* compiled from: BentoPog.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoPogContent$RemoteImage;", "Lcom/robinhood/compose/bento/component/BentoPogContent;", "url", "", "backupText", "foregroundColorOverride", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getUrl", "()Ljava/lang/String;", "getBackupText", "getForegroundColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RemoteImage implements BentoPogContent {
        public static final int $stable = 0;
        private final String backupText;
        private final Color foregroundColorOverride;
        private final String url;

        public /* synthetic */ RemoteImage(String str, String str2, Color color, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, color);
        }

        private RemoteImage(String url, String str, Color color) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.backupText = str;
            this.foregroundColorOverride = color;
        }

        public /* synthetic */ RemoteImage(String str, String str2, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : color, null);
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getBackupText() {
            return this.backupText;
        }

        /* renamed from: getForegroundColorOverride-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getForegroundColorOverride() {
            return this.foregroundColorOverride;
        }
    }
}
