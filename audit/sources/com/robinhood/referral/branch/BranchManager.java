package com.robinhood.referral.branch;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.robinhood.utils.http.ContentEncoding;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: BranchManager.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&JT\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2:\u0010\u000b\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\fH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0011H'J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0003H&¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/referral/branch/BranchManager;", "", "appInit", "", "context", "Landroid/content/Context;", "initSession", WebsocketGatewayConstants.DATA_KEY, "Landroid/net/Uri;", "activity", "Landroid/app/Activity;", "listener", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "referringParams", "", "error", "setIdentity", ContentEncoding.IDENTITY, "disableTracking", "", "logout", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public interface BranchManager {
    void appInit(Context context);

    void disableTracking(boolean disableTracking);

    void initSession(Uri data, Activity activity, Function2<? super JSONObject, ? super String, Unit> listener);

    void logout();

    void setIdentity(String identity);
}
