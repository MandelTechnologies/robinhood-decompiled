package com.robinhood.android.libdesignsystem.serverui.experimental.page;

import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import kotlin.Metadata;

/* compiled from: StandardPageFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/page/StandardPageFragment;", "ActionT", "Landroid/os/Parcelable;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/ActionHandlingFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "content", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "handle", "action", "(Landroid/os/Parcelable;)Z", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class StandardPageFragment<ActionT extends Parcelable> extends ActionHandlingFragment<ActionT> {
    public static final int $stable = 8;
    private final StandardPageTemplate<ActionT> content;
    private final boolean toolbarVisible;
    private final boolean useDesignSystemToolbar = true;

    public abstract boolean handle(ActionT action);

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    public StandardPageTemplate<ActionT> getContent() {
        return this.content;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        String logging_screen_identifier;
        StandardPageTemplate<ActionT> content = getContent();
        return (content == null || (logging_screen_identifier = content.getLogging_screen_identifier()) == null) ? "NAME_UNSPECIFIED" : logging_screen_identifier;
    }
}
