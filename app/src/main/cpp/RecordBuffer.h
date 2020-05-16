//
// Created by yangw on 2018-9-3.
//

#ifndef OPENSLESRECORD_RECORDBUFFER_H
#define OPENSLESRECORD_RECORDBUFFER_H


class RecordBuffer {

public:
    short **buffer;
    int index = -1;

public:
    RecordBuffer(int buffersize);
    ~RecordBuffer();

    short *getRecordBuffer();

    short * getNowBuffer();


};


#endif //OPENSLESRECORD_RECORDBUFFER_H
