package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CredentialProviderBeginSignInController.kt */
@Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1, reason: use source file name */
/* loaded from: classes4.dex */
/* synthetic */ class CredentialProviderBeginSignInController9 extends FunctionReferenceImpl implements Function2<String, String, GetCredentialException> {
    CredentialProviderBeginSignInController9(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final GetCredentialException invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).m521xd975db95(str, str2);
    }
}
