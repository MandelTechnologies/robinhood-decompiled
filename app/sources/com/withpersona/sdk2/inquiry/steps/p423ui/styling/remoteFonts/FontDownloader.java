package com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts;

import android.graphics.Typeface;
import android.os.Bundle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FontDownloader.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH&J$\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011H'J\u0018\u0010\u0013\u001a\u00020\t2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H&R*\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/FontDownloader;", "", "fontDownloaderMapping", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getFontDownloaderMapping", "()Ljava/util/Map;", "saveState", "", "outState", "Landroid/os/Bundle;", "restoreState", "inState", "downloadFont", "fontUrl", "onSuccess", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "updateMapping", "remoteFonts", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RemoteFont;", "Companion", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface FontDownloader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void downloadFont(String fontUrl, Function1<? super Typeface, Unit> onSuccess);

    Map<String, Map<StyleElements.FontWeight, String>> getFontDownloaderMapping();

    void restoreState(Bundle inState);

    void saveState(Bundle outState);

    void updateMapping(List<RemoteFont> remoteFonts);

    /* compiled from: FontDownloader.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/FontDownloader$Companion;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/FontDownloader;", "instance", "", "setInstance", "(Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/FontDownloader;)V", "_instance", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/FontDownloader;", "getInstance", "()Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/FontDownloader;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static FontDownloader _instance;

        private Companion() {
        }

        public final FontDownloader getInstance() {
            FontDownloader fontDownloader = _instance;
            Intrinsics.checkNotNull(fontDownloader);
            return fontDownloader;
        }

        public final void setInstance(FontDownloader instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            _instance = instance;
        }
    }
}
