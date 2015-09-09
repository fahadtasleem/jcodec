package org.jcodec.api.specific;

import java.io.IOException;

import org.jcodec.api.FrameGrab.MediaInfo;
import org.jcodec.common.SeekableDemuxerTrack;
import org.jcodec.common.model.Picture;

/**
 * This class is part of JCodec ( www.jcodec.org ) This software is distributed
 * under FreeBSD License
 * 
 * Frame grabber adapter for I-frame based codecs like ProRes and JPEG in
 * containers like MOV ( Quicktime )
 * 
 * @author Stan Vitvitskyy
 * 
 */
public class IFrameOnlyAdapter extends CodecContainerAdaptor {

    public IFrameOnlyAdapter(SeekableDemuxerTrack track) {
        super(track);
    }

    @Override
    public Picture nextFrame() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MediaInfo getMediaInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void seek(double second) throws IOException {
        // TODO Auto-generated method stub

    }

    @Override
    public void gotoFrame(int frameNumber) throws IOException {
        // TODO Auto-generated method stub

    }

    @Override
    public void seekToKeyFrame(double second) throws IOException {
        // TODO Auto-generated method stub

    }

    @Override
    public void gotoToKeyFrame(int frameNumber) throws IOException {
        // TODO Auto-generated method stub

    }
}